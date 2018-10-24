package strings;

import java.util.ArrayList;
import java.util.List;

public class UndobleStringBuilder {

    private static class Action{
        public void undo(){}
    }

    private class DeleteAction extends Action{
        private int size;


        public DeleteAction(int size) {
            this.size = size;
        }

        public void undo(){
            stringBuilder.delete(stringBuilder.length() - size, stringBuilder.length());
        }
    }


    // Not generic, just ArrayList
    ArrayList actionList = new ArrayList();

    private StringBuilder stringBuilder;

    public UndobleStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    public UndobleStringBuilder(StringBuilder s) {
        stringBuilder = new StringBuilder(s);
    }

    public UndobleStringBuilder reverse() {
        stringBuilder.reverse();

        Action action = new Action(){
            public void undo() {
                stringBuilder.reverse();
            }
        };

        actionList.add(action);

        return this;
    }


    public UndobleStringBuilder append(String str) {
        stringBuilder.append(str);

        Action action = new Action(){
            public void undo() {
                stringBuilder.delete(
                        stringBuilder.length() - str.length() -1, stringBuilder.length());

            }
        };

        actionList.add(action);


        return this;
    }

    public UndobleStringBuilder append(StringBuffer sb) {
        stringBuilder.append(sb);
        actionList.add(new DeleteAction(sb.length()));
        return this;
    }

    public UndobleStringBuilder append(CharSequence s) {
        stringBuilder.append(s);
        actionList.add(new DeleteAction(s.length()));
        return this;
    }

    public UndobleStringBuilder append(CharSequence s, int start, int end) {
        stringBuilder.append(s, start, end);
        actionList.add(new DeleteAction(end - start));
        return this;
    }

    public UndobleStringBuilder append(char[] str) {
        stringBuilder.append(str);
        actionList.add(new DeleteAction(str.length));
        return this;
    }

    public UndobleStringBuilder append(char[] str, int offset, int len) {
        stringBuilder.append(str, offset, len);
        actionList.add(new DeleteAction(len));
        return this;
    }

    public UndobleStringBuilder append(boolean b) {
        stringBuilder.append(b);
        actionList.add(new DeleteAction(String.valueOf(b).length()));
        return this;
    }


    public UndobleStringBuilder append(char c) {
        stringBuilder.append(c);
        actionList.add(new DeleteAction(1));
        return this;
    }


    public UndobleStringBuilder append(int i) {
        stringBuilder.append(i);
        actionList.add(new DeleteAction(String.valueOf(i).length()));
        return this;
    }

    public UndobleStringBuilder append(long lng) {
        stringBuilder.append(lng);
        actionList.add(new DeleteAction(String.valueOf(lng).length()));
        return this;
    }

    public StringBuilder append(float f) {
        return stringBuilder.append(f);
    }

    public StringBuilder append(double d) {
        return stringBuilder.append(d);
    }


    public void undo(){
        // (Action) actionList means casting
        Action last = (Action) actionList.get(actionList.size() - 1);
        actionList.remove(actionList.size() - 1);
        last.undo();
    }

    public String toString() {
        return stringBuilder.toString();
    }


}