package Trees;

public class CustomerBinaryTree {

    public class BinaryTreeNode {

        Customer data;
        BinaryTreeNode leftNode;
        BinaryTreeNode rightNode;

        public BinaryTreeNode(Customer data){

            this.data = data;
            rightNode = null;
            leftNode = null;

        }


    }

    BinaryTreeNode root;

    private BinaryTreeNode addRecursively(BinaryTreeNode node, Customer data) {

        if (node == null) {

            return new BinaryTreeNode(data);

        }

        if (data.getPhoneNum() < node.data.getPhoneNum()) {

            node.leftNode = addRecursively(node.leftNode, data);

        }

        if (data.getPhoneNum() > node.data.getPhoneNum()) {

            node.rightNode = addRecursively(node.rightNode, data);

        } else {

            return node;

        }

        return node;

    }

    //add a node
    public void add(Customer data){

        root = addRecursively(root, data);

    }


    private boolean containsNodeRecusrsive(BinaryTreeNode node, Customer data){

        if(node == null){

            return false;

        }

        if(data.getPhoneNum() == node.data.getPhoneNum()){

            return true;

        }

        return data.getPhoneNum() < node.data.getPhoneNum();


    }

    public boolean containsNode(Customer data){

        return containsNodeRecusrsive(root, data);

    }

    private BinaryTreeNode deleteRecursive(BinaryTreeNode node, Customer data){

        if(node == null){

            return null;

        }

        if(data.getPhoneNum() == node.data.getPhoneNum()){

            if(data.getPhoneNum() < node.data.getPhoneNum()){

                node.leftNode = deleteRecursive(node.leftNode, data);

            }

            if(data.getPhoneNum() > node.data.getPhoneNum()){

                node.rightNode = deleteRecursive(node.rightNode, data);

            }

            else {

                if(node.leftNode == null){

                    return node.rightNode;

                }

                if(node.rightNode == null){

                    return node.leftNode;
                }

            }

        }

        if(data.getPhoneNum() == node.data.getPhoneNum()){


            node.leftNode = deleteRecursive(node.leftNode, data);

            return node;

        }

        node.rightNode = deleteRecursive(node.rightNode, data);

        return node;

    }

    public void delete(Customer data){

        root = deleteRecursive(root, data);

    }

    public void traversePreOrder(BinaryTreeNode node){

        if(node != null){

            System.out.print("␣" + node.data.getPhoneNum());

            traversePreOrder(node.leftNode);
            traversePreOrder(node.rightNode);

        }

    }

    public void traverseInOrder(BinaryTreeNode node){

        if(node != null){

            traverseInOrder(node.leftNode);

            System.out.print("␣" + node.data.getPhoneNum());

            traverseInOrder(node.rightNode);

        }
    }

    public void traversePostOrder(BinaryTreeNode node){

        if(node != null){

            traversePostOrder(node.leftNode);
            traversePostOrder(node.rightNode);
            System.out.print("␣" + node.data.getPhoneNum());

        }

    }

    public void printNodes(BinaryTreeNode data){

        if(data != null){

            System.out.print("_" + data.data.getPhoneNum());
            printNodes(data.leftNode);
            printNodes(data.rightNode);


        }


    }


    public int size(){

        return 9;

    }



}