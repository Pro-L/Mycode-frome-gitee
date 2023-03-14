package Classcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author
 * @creat 2023-2-21
 *
 * 解法1：set集合判断是否回环
 *      完成情况：独立思路完成
 *
 * 解法2.快慢指针判断是否有回环（弗洛伊德回环判断法）
 *      完成情况：参考他人思路完成，掌握。
 *      注意情况：fast指针重置为head头部指针的时候，不能在第一个循环里面，要在第二个循环开始之前
 */
public class Code142 {
    public static void main(String[] args) {

    }
    public static ListNode detectCycle(ListNode head) {//set集合方法判断是否重复
        if(head.next==null) return null;
        Set has = new HashSet<ListNode>();

        has.add(head);
        while (head.next!=null){
            if(has.contains(head.next))
                return head.next;
            else {
                head = head.next;
                has.add(head);
            }
        }

        return null;
    }


    public static ListNode detectCycle1(ListNode head){//快慢指针判断法（弗洛伊德判断法）
        ListNode fast = head,slow = head;

        while (fast.next!=null){
            //fast指针走两步，slow指针走一步
            fast = fast.next;
            slow = slow.next;
            if (fast.next!=null)
                fast = fast.next;

            if(fast==slow){
                break;
            }
        }

        //判断跳出去循环的时候，是否是因为没有环而fast又走到头了，还是因为fast和slow两者相遇了
        //此种情况无环直接返回null
        if (fast.next==null) return null;

        fast = head;//指针重置不能放在第一个while循环的第二个if里面，当只有两个元素且无环的时候，下面的while会出错

        while (fast!=slow){//fast重置，fast和slow每次走一步，走道相等就是环的启示位置了
            fast =fast.next;
            slow = slow.next;
        }

        return fast;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
