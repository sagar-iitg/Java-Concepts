package com.linkedList;

public class Solution {

	static class Node {

		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	// create an object of a Node class
	Node head;

	public static void main(String[] args) {
		Solution ll = new Solution();
		ll.head = new Node(0);
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		ll.head.next = first;
		first.next = second;
		second.next = third;
		System.out.println("Linked list is:");
		while (ll.head != null) {
			System.out.print(ll.head.data + " ");
			ll.head = ll.head.next;

		}
	}

}
