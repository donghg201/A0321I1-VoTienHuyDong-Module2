package bai12_JavaCollectionFramework.thuc_hanh.OptionalBinarySearchTree;

public interface Tree<E> {
    public boolean insert(E e);

    public void inorder();

    public int getSize();
}
