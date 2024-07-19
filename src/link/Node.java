package link;

/*
낭비되는 메모리 없이 딱 필요한 만큼만 메모리를 확보해서 사용하고,
또 앞이나 중간에 데이터를 추가하거나 삭제할 때 도 효율적인 자료 구조
 */
public class Node {

    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }


    //[A->B->C]
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this; //x01
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if (x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
