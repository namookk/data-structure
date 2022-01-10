Queue
===

### Queue란?

Queue는 데이터를 일시적으로 쌓아두기 위한 자료구조 입니다.  
FIFO(First In First Out)의 형태를 가집니다.  
FIFO란 뜻 그대로 먼저 들어온 데이터가 가장 먼저 나가는 구조를 말합니다.  

Queue의 특징은 아래와 같습니다.
1. FIFO(First In First Out) 구조
2. 한 쪽 끝은 front로 정하여 삭제 연산만 수행
3. 다른 한 쪽 끝은 rear로 정하여 삽입 연산만 수행
4. 그래프 넓이 우선 탐색(BFS)에서 많이 사용

Queue를 생성하는 방법입니다.
```java
Queue<Integer> queue = new LinkedList<Integer>();
Queue<String> queue = new LinkedList<String>();
```
위 와 같이 LinkedList를 활용하여 생성해야 하므로 Queue와 LinkedList 둘 다 import되어 있어야 합니다.

### Queue에서 자주 사용하는 Method

1. **offer(E e)** : Queue에 e를 추가합니다. Queue가 꽉 찼으면 IllegalException 예외를 발생시킵니다.
2. **add(E e)** : Queue에 e를 추가합니다. Queue가 꽉 찼으면 false를 반환합니다.
3. **peek()** : Queue에서 다음 반환 될 데이터를 검사하고 반환합니다. Queue가 비어있다면 null을 반환합니다. 
4. **element()** : Queue에서 다음 반환 될 데이터를 검사하고 반환합니다. Queue가 비어잇다면 NoSuchElementException 예외를 발생시킵니다.
5. **remove()** : Queue에서 다음 반환 될 데이터를 삭제합니다. Queue가 비어있다면 NoSuchElementException 예외를 발생시킵니다.
6. **poll()** : 