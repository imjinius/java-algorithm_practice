class PCB {
    public int data;
    public int right;
    public int left;
}

public class TreePractice {
    public static PCB[] tree = new PCB[10];
    public static int rootIdx = 0;
    public static int newIdx = 0;

    public static void addPCB(int data) {
        int currentIdx;
        boolean addFlag;

        tree[newIdx].data = data;
        tree[newIdx].right = -1;
        tree[newIdx].left = -1;

        if (rootIdx != newIdx) {
            currentIdx = rootIdx;
            addFlag = false;
            do {
                if (data < tree[currentIdx].data) {
                    if (tree[currentIdx].left == -1) {
                        tree[currentIdx].left = newIdx;
                        addFlag = true;
                    } else {
                        currentIdx = tree[currentIdx].left;
                    }
                } else {
                    if (tree[currentIdx].right == -1) {
                        tree[currentIdx].right = newIdx;
                        addFlag = true;
                    } else {
                        currentIdx = tree[currentIdx].right;
                    }
                }
            } while (addFlag == false);
        }

        newIdx++;
    }

}
