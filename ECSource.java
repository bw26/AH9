class ECSource {
  public static <T> boolean isUnivalueList(Node<T> head) {
    // todo
    // T val = head.val;
    // while (head != null) {
    //   if (!val.equals(head.val)) return false;
    //   head = head.next;
    // }
    // return true;
    
    //Recursion
    if (head.next == null) return true;
    T val = head.val;
    if(val.equals(head.next.val)) return isUnivalueList(head.next);
    else return false;
  }

  public static void main(String[] args) {
    Node<String> z = new Node<>("z");
    // z

    // Printing solution
    System.out.println((ECSource.isUnivalueList(z)));//true

    Node<Integer> u = new Node<>(2);
    Node<Integer> v = new Node<>(2);
    Node<Integer> w = new Node<>(2);
    Node<Integer> x = new Node<>(2);
    Node<Integer> y = new Node<>(2);

    u.next = v;
    v.next = w;
    w.next = x;
    x.next = y;

    // 2 -> 2 -> 2 -> 2 -> 2

    System.out.println(ECSource.isUnivalueList(u)); // true

    u = new Node<>(2);
    v = new Node<>(2);
    w = new Node<>(3);
    x = new Node<>(3);
    y = new Node<>(2);

    u.next = v;
    v.next = w;
    w.next = x;
    x.next = y;

    // 2 -> 2 -> 3 -> 3 -> 2

    System.out.println(ECSource.isUnivalueList(u)); // false
  }
}
