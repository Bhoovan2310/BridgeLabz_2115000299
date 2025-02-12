class TextState {
    String text;
    TextState prev, next;

    public TextState(String text) {
        this.text = text;
        this.prev = this.next = null;
    }
}

class TextEditor {
    private TextState head, current;
    private final int HISTORY_LIMIT = 10;
    private int size = 0;

    public TextEditor() {
        head = current = null;
    }

    public void addState(String newText) {
        TextState newState = new TextState(newText);
        if (current == null) {
            head = current = newState;
        } else {
            current.next = newState;
            newState.prev = current;
            current = newState;
        }
        size++;
        if (size > HISTORY_LIMIT) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo: " + current.text);
        } else {
            System.out.println("No more undo available.");
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo: " + current.text);
        } else {
            System.out.println("No more redo available.");
        }
    }

    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current State: " + current.text);
        } else {
            System.out.println("Editor is empty.");
        }
    }
}

public class UndoRedoEditor {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");

        editor.displayCurrentState();
        
        editor.undo();
        editor.undo();
        editor.redo();

        editor.addState("New Text Added");
        editor.displayCurrentState();
    }
}
