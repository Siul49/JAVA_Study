package ch5_practice.fourteen;

import java.util.Scanner;

public class GraphicEditor {
    private Shape head = null;
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("그래픽 에디터 Beauty Graphic Editor를 실행합니다.");
        while (true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            int cmd = scanner.nextInt();
            switch (cmd) {
                case 1 -> insert();
                case 2 -> delete();
                case 3 -> showAll();
                case 4 -> {
                    System.out.println("Beauty Graphic Editor를 종료합니다.");
                    return;
                }
                default -> System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private void insert() {
        Shape newShape = createShape();
        if (newShape == null) return;
        addShapeToEnd(newShape);
    }

    private Shape createShape() {
        System.out.print("Line(1), Rect(2), Circle(3)>>");
        int type = scanner.nextInt();

        switch (type) {
            case 1: return new Line();
            case 2: return new Rect();
            case 3: return new Circle();
            default:
                System.out.println("잘못된 입력입니다.");
                return null;
        }
    }

    private void addShapeToEnd(Shape shape) {
        if (head == null) {
            head = shape;
        } else {
            Shape lastNode = getLastNode();
            lastNode.setNext(shape);
        }
    }

    private Shape getLastNode() {
        Shape current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current;
    }

    private void delete() {
        System.out.print("삭제할 도형의 위치>>");
        int position = scanner.nextInt();

        if (!validatePosition(position)) return;

        if (position == 1) {
            deleteHead();
        } else {
            deleteNodeAtPosition(position);
        }
    }

    private boolean validatePosition(int position) {
        if (head == null || position < 1) {
            System.out.println("삭제할 수 없습니다.");
            return false;
        }
        return true;
    }

    private void deleteHead() {
        head = head.getNext();
    }

    private void deleteNodeAtPosition(int targetPosition) {
        NodePair nodes = findNodesAtPosition(targetPosition);
        if (nodes.current == null) {
            System.out.println("삭제할 수 없습니다.");
            return;
        }
        nodes.previous.setNext(nodes.current.getNext());
    }

    private NodePair findNodesAtPosition(int targetPosition) {
        Shape previous = head;
        Shape current = head.getNext();
        int currentPosition = 2;

        while (current != null && currentPosition < targetPosition) {
            previous = current;
            current = current.getNext();
            currentPosition++;
        }
        return new NodePair(previous, current);
    }

    private void showAll() {
        traverseShapes(this::printShape);
    }

    private void traverseShapes(ShapeProcessor processor) {
        Shape current = head;
        while (current != null) {
            processor.process(current);
            current = current.getNext();
        }
    }

    private void printShape(Shape shape) {
        shape.draw();
    }

    private static class NodePair {
        Shape previous;
        Shape current;

        NodePair(Shape previous, Shape current) {
            this.previous = previous;
            this.current = current;
        }
    }

    @FunctionalInterface
    private interface ShapeProcessor {
        void process(Shape shape);
    }

    public static void main(String[] args) {
        new GraphicEditor().run();
    }
}
