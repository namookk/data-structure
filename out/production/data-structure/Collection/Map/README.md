Map(맵)
===

### Map이란?

Map은 Collection Framework에 Map으로 나누어진 객체로 Key, Value형식을 가지고 있습니다.
1. Key는 중복일 수 없다.
2. Key와 Value중 하나만 존재하지 않는다.
3. Value는 중복이 가능하다.

이렇게 3가지가 Map의 특징이라고 할 수 있습니다.

### Map의 주요 Method

1. **put(key, value)** : key와 value쌍으로 Map에 데이터를 저장합니다.
2. **get(key)** : map에서 해당 key값으로 value를 반환합니다.
3. **getOrDefault(key, value)** : map에서 해당 key값으로 value를 반환하는데 해당 key값으로 되어있는 데이터가 없으면 인자로 준 value값을 반환합니다.
4. **containsKey(key)** : 해당 key값이 존재하면 true, 없으면 false로 반환합니다.
5. **keySet()** : map에 담겨있는 key를 set자료구조형으로 반환합니다.
6. **remove(key)** : map에 해당 key값의 데이터를 삭제합니다.

### HashMap

Map Interface 구현체로 HashTable을 사용한 클래스로 일반적으로 많이 사용하는 Map자료구조입니다.
중복을 허용하지 않고 순서를 보장하지 않습니다.
키와 값으로 null이 허용됩니다.

HashMap은 아래와 같이 생성 가능합니다.
```java
Map<String, Integer> map = new HashMap<String, Integer>(); 
```

### HashTable

HashMap과 동일한 특징을 가지고 있지만 차이점은 HashTable은 `Thread-Safe`하여 동기화를 지원합니다.  
HashMap보단 처리속도가 느립니다.  
HashMap과 다르게 key와 value값으로 null을 허용하지 않습니다.

HashTable은 아래와 같이 생성 가능합니다.
```java 
Map<String, Integer> hashTable = new HashTable<String, Integer>();
```

### LinkedHashMap

HashMap과 동일한 특징을 가지고 있고 HashMap에서는 순서를 보장하지않지만 LinkedHashMap에서는 순서를 보장합니다.

LinkedHashMap은 아래와 같이 생성 가능합니다.
```java
Map<String, Integer> map = new LinkedHashMap<String, Integer>();
```

### TreeMap

이진탐색트리 기반으로 key와 value를 저장합니다.  
key값을 인자로 준 Comparator기반으로 정렬되고 default는 오름차순입니다.  
빠른 검색이 가능합니다.   
저장 시 정렬을 하기 때문에 처리속도가 느립니다.  

TreeMap은 아래와 같이 생성 가능합니다.
```java
Map<String, Integer> map = new TreeMap<String, Integer>(); // 기본 오름차순
Map<String, Integer> map = new TreeMap<String, Integer>((a,b) -> b.compareTo(a)); // 내림차순
```
