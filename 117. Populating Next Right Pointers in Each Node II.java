  public Node connect(Node root) {
        if(root == null) return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
           int size = q.size();
          Node dummy = new Node(0);
           while(size --> 0){
               Node node = q.remove();
               dummy.next = node;
               dummy = dummy.next;
               
               if(node.left != null){
                   q.add(node.left);
               }
               if(node.right != null){
                   q.add(node.right);
               }
           } 
        }
        return root;
    }