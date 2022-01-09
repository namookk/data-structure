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
6. **poll()** : Queue에서 다음 반환 될 데이터를 삭제하고 반환합니다. Queue가 비어있다면 null을 반환합니다.
7. **clear()** : Queue에 모든 데이터를 제거합니다.

### Priority Queue(우선순위 큐)란?

위에서 설명한 Queue는 FIFO(FirstInFirstOut)구조로 데이터를 삽입 삭제하는 구조이지만 PriorityQueue는 먼저 들어온 순서대로 데이터가 나가는 것이 아닌 우선순위를 먼저 결정하고 그 우선순위가 높은 엘리먼트가 먼저 나가는 자료구조입니다.  
우선순위 큐는 힙을 이용하여 구현하는 것이 일반적입니다.  
데이터를 삽입할 때 우선순위를 기준으로 최대힙 혹은 최소힙을 구성하고 데이터를 꺼낼 때 루트 노드를 얻어낸 뒤 루트 노드를 삭제할 때는 빈 루트 노드 위치에 맨 마지막 노드를 삽입한 후 아래로 내려가면서 적절한 자리를 찾아서 옮기는 방식으로 진행됩니다.

PriorityQueue의 특징은 아래와 같습니다.
1. 높은 우선순위의 요소를 먼저 꺼내서 처리하는 구조 
2. 내부 요소는 힙으로 구성되어 이진트리 구조로 이루어져 있음
3. 내부구조가 힙으로 구성되어 있기에 시간 복잡도는 O(NLogN)

PriorityQueue는 아래와 같이 생성합니다.
```java
PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); // default 오름차순
PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder()); //내림차순
PriorityQueue<Integer[]> pq = new PriorityQueue<Integer[]>((a,b) -> b[0] - a[0]); //람다식 구현
        
//Comparable구현체를 가지는 PriorityQueue
PriorityQueue<Point> pq = new PriorityQueue<Point>();

class Point implements Comparable<Point>{
    int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public int compareTo(Point p){
        return this.x - p.x;
    }
}
```

### PriorityQueue는에서 자주 사용하는 Method

Queue와 동일합니다.