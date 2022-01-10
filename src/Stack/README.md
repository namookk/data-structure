Stack(스택)
===

### Stack이란?

사전적 의미로는 `쌓다`, `더미` 라는 뜻을 가지고 있습니다.
Collection 프레임워크의 일부이며 Queue와 반대로 LIFO(Last In First Out)의 구조를 가지고 있습니다.

LIFO는 마지막에 들어간 데이터가 먼저 나오는 구조입니다.

### Stack의 사용

Stack은 아래와 같이 생성합니다.
```java
Stack<E> stack = new Stack<E>();
Stack<Integer> stack = new Stack<Integer>();
```

### Stack에서 사용하는 Method

1. **push(E e)** : stack에 e를 추가합니다.
2. **pop()** : stack에서 마지막에 삽입한 데이터를 제거 후 반환합니다.
3. **peek()** : stack에서 마지막에 삽입한 데이터를 반환 합니다.
4. **isEmpty()** : stack이 비어있으면 true 아니면 false 를 반환합니다.
5. **size()** : stack의 길이를 반환합니다.



<br/><br/>

## Deque(데크)

### Deque란?

Deque는 Double-Ended Queue의 줄임말로 큐의 양쪽에서 데이터를 넣고 뺄 수 있는 형태의 자료구조를 의미합니다. 
하나의 자료구조에 큐(Queue)와 스택(Stack)을 합쳐놓은 형태라고 생각하면 됩니다.

### Deque의 사용

Deque는 아래와 같이 생성합니다.
```java
Deque<E> deque = new LinkedList<E>();
Deque<E> deque = new ArrayDeque<E>();
Deque<E> deque = new LinkedBlockingDeque<E>();
Deque<E> deque = new ConcurrentLinkedDeque<E>();
```

Deque의 자료구조의 여러 연산들은 Deque 인터페이스에 정의되어 있고, 이를 구현한 LinkedList, ArrayDeque, LinkedBlockingDeque, ConcurrentLinkedDeque 가 있습니다.

### Deque에서 사용하는 Method

1. **addFirst(E e)** : deque의 앞쪽에 데이터를 삽입한다. 용량 초과시 예외를 발생시킨다.
2. **offerFirst(E e)** : deque의 앞쪽에 데이터를 삽입한다. 용량 초과시 false를 반환한다. 
3. **addLst(E e)** : deque의 뒤쪽에 데이터를 삽입한다. 용량 초과시 예외를 발생시킨다.
4. **offerLast(E e)** : deque의 뒤쪽에 데이터를 삽입한다. 용량 초과시 예외를 발생시킨다. 
5. **add(E e), offer(E e)** : addLast, offerLast와 동일 
6. **push(E e)** : addFirst와 동일
7. **removeFirst()** : deque의 맨앞의 데이터를 반환 후 제거합니다. 비어있을 경우 예외를 발생시킵니다.
8. **remove()** : removeFirst와 동일합니다.
9. **pop()** : removeFirst와 동일합니다.
10. **poll()** : deqeue의 맨앞의 데이터를 반환 후 제거합니다. 비어있을 경우 null을 반환합니다.
11. **pollFirst()** : poll과 동일합니다.
12. **removeLast()** : deque의 맨뒤의 데이터를 반환 후 제거합니다. 비어있을 경우 예외를 발생시킵니다.
13. **pollLast()** : deque의 맨뒤의 데이터를 반환 후 제거합니다. 비어있을 경우 null을 반환합니다.
