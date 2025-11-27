class Nodee{
    int val;
    Nodee left;
    Nodee right;

    Nodee(int val){
        this.val=val;
    }
}
class BinaryTree{
//    Nodee root;
   static int indx=-1;
    public static Nodee buildTree(int val[]){
        indx++;
        if(val[indx]==-1)
            return null;

        Nodee newOne=new Nodee(val[indx]);
        newOne.left=buildTree(val);
        newOne.right=buildTree(val);

        return newOne;
    }

    public static void preOrder(Nodee node){
        if(node==null)
            return;

        System.out.print(node.val+ " -> ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void InOrder(Nodee node){
        if(node==null)
            return;

        InOrder(node.left);
        System.out.print(node.val+ " -> ");
        InOrder(node.right);
    }

    public static void postOrder(Nodee node){
        if(node==null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val+ " -> ");
    }
}


public class d204 {
    public static void main(String[] args) {
BinaryTree tree=new BinaryTree();
//    tree.root=new Nodee(1);
//    tree.root.left=new Nodee(3);
//    tree.root.right=new Nodee(5);
//    tree.root.left.left=new Nodee(9);
//    tree.root.left.right=new Nodee(7);
        int vals[]={1, 3, 7, -1, -1, -1, 5, 11, -1, -1, 4, 9, -1, -1, -1};
        Nodee root=tree.buildTree(vals);

        System.out.println("PREORDER");
    BinaryTree.preOrder(root);
        System.out.println("\n INORDER");
    BinaryTree.InOrder(root);
        System.out.println("\n POSTORDER");
    BinaryTree.postOrder(root);
    }
}
