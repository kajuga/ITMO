package strings.UndoStringBuilder;

import java.util.Stack;



public class UndoStringBuilder {
    private StringBuilder stringBuilder;
    private Stack operations = new Stack();
    private OnChangeListener onChangeListener;




    public abstract static class OnChangeListener{
        public abstract void onChange(UndoStringBuilder undoStringBuilder);
    }

    private abstract class Action{
        abstract void execute();
    }

    private class DeleteAction extends Action{

        private int deleteFrom;

        public DeleteAction(int deleteFrom) {
            this.deleteFrom = deleteFrom;
        }

        @Override
        void execute() {
            stringBuilder.delete(deleteFrom, stringBuilder.length());
        }
    }


    public UndoStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    public UndoStringBuilder(String s){
        stringBuilder = new StringBuilder(s);
    }

    public UndoStringBuilder append(String str) {
        operations.push(new DeleteAction(stringBuilder.length()));
        stringBuilder.append(str);
        if(onChangeListener != null){
            onChangeListener.onChange(this);
        }

        return this;
    }

    public void setOnChangeListener(OnChangeListener onChangeListener) {
        this.onChangeListener = onChangeListener;
    }

    public UndoStringBuilder reverse() {
        operations.push(new Action() {
            @Override
            void execute() {
                stringBuilder.reverse();
            }
        });

        stringBuilder.reverse();
        if(onChangeListener != null){
            onChangeListener.onChange(this);
        }
        return this;

    }

    public UndoStringBuilder undo(){
        ((Action) operations.pop()).execute();
        if(onChangeListener != null){
            onChangeListener.onChange(this);
        }
        return this;
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}