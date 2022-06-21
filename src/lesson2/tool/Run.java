package lesson2.tool;

public class Run {
    public static void main(String[] args) {
        Drum drum1 = new Drum(12.2);
        Guitar guitar1 = new Guitar(6);
        Guitar guitar2 = new Guitar(7);
        Pipe pipe1 = new Pipe(10.2);
        Pipe pipe2 = new Pipe(15.6);
        Guitar guitar3 = new Guitar(4);
        Drum drum2 = new Drum(42.3);
        Tool[] tools = new Tool[]{drum1, guitar1, guitar2, pipe1, pipe2, guitar3, drum2};
        for (Tool tool: tools) {
            tool.play();
        }
    }
}
