// Copyright (c) 2013 Elements of Programming Interviews. All rights reserved.
// @author Andrey Pavlov

package com.epi;

class DeletionList {
  // @include
  public static void deletionFromList(Node<Integer> v) {
    v.data = v.next.data;
    v.next = v.next.next;
  }
  // @exclude

  public static void main(String[] args) {
    Node<Integer> L = new Node<>(1, new Node<>(2,
        new Node<>(3, null)));
    deletionFromList(L);
    assert (L.data == 2 && L.next.data == 3);
  }
}
