//98. Validate Binary Search Tree
 public boolean isValidBST(TreeNode root){
     return validate(root,null,null);
     
}
 public boolean validate(TreeNode root,Integer Max, Integer Min){
   if(root == null){
       return true;
       
   } else if(Max != null && root.val >= Max || Min != null && root.val <= Min){
       return false;
   }else{
       return validate(root.left, root.val, Min) && validate(root.right, Max, root.val);
   }
 }