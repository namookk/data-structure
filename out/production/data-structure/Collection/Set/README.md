Set
===

### Set이란?

Set은 Collection의 한 종류이며 대표적으로 HashSet, LinkedSet, TreeSet 세가지가 있고, 그 중 HashSet을 가장 많이 사용합니다.

Set의 특징으로는
1. 중복된 데이터를 허용하지 않음
2. Collection의 추상 메서드만 사용
3. 비선형 자료구조로서 순서가 없음
4. null값 저장 가능

### HashSet

HashMap과 동일하게 Hash를 사용하여 값을 저장합니다.
Hash는 저장하고, 조회하는데 있어 가장 빠른 알고리즘이므로 TreeSet 보다 처리속도가 빠릅니다.

HashSet은 아래와 같이 생성합니다.
```java
HashSet<String> hashSet = new HashSet<String>([초기 값]);
```

인자로 List형 자료구조를 넣으면 초기값을 셋팅할 수 있습니다.

### LinkedHashSet

HashSet과 동일한 특징을 가지지만 Set의 특징 중 순서가 없는 것을 보완하여 순서를 보장합니다.

LinkedHashSet은 아래와 같이 생성합니다.
```java
LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>([초기 값]);
```

### TreeSet

HashMap, LinkedHashMap은 Hash방식으로 값을 저장하고 조회해온다면 TreeSet은 이진탐색트리의 형태로 데이터를 저장하는 자료구조입니다.

데이터의 추가, 삭제에서는 처리속도가 느리지만 검색과 정렬이 뛰어나다는 장점이 있습니다.

HashSet과 동일한 특징을 가지고 있고 기본 정렬은 오름차순입니다.

TreeSet은 아래와 같이 생성합니다.
```java
TreeSet<String> treeSet = new TreeSet<String>([초기 값]); //정렬 기준
```

