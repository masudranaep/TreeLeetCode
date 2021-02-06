public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output_array = new LinkedList<>();
        if(root == null){
            return output_array;
        }
        stack.add(root);
        while(!stack.isEmpty()){
             Node node = stack.pollLast();
            output_array.add(node.val);
            Collections.reverse(node.children);
            for(Node child : node.children){
                stack.add(child);
            }
        }
        return output_array;
    }