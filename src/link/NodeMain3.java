package link;

public class NodeMain3 {
    public static void main(String[] args) {
        //노드 생성하고 연결: A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        //모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        //마지막 노드 조회하기
        Node lageNode = getLastNode(first);
        System.out.println("lastNode = " + lageNode);

        //특정 index의 노드 조회
        int index = 2;
        Node indexNode = getNode(first, index);
        System.out.println("indexNode = " + indexNode);

        //데이터 추가
        add(first, "D");
        System.out.println(first);
    }

    private static void add(Node node, String param) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++){
            x = x.next;
        }
        return x;
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null){
            x = x.next;
        }
        return x;
    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null){
            System.out.println(x.item);
            x = x.next;
        }
    }
}
