배열(Array)
===

### 배열이란?

배열은 연관된 데이터를 모아서 관리하기 위해 사용되는 자료구조입니다.  

### 배열 생성

Java에서 배열을 생성하는 코드입니다.
```java
int[] nums = new int[4];  // 비어 있는 배열 선언 ( 기본값으로 초기화 )
int[] nums2 = new int[]{1,2,3,4}; // 선언과 동시에 초기화
int[] nums3 = {1,2,3,4}; //선언과 동시에 초기화2
```
자바에서 위 코드로 배열을 생성하게 되면 메모리에 크기 4만큼의 공간을 할당하여 사용자가 사용할 수 있도록 합니다.

배열은 메모리상에 고정된 크기의 연속된 공간을 갖고 있어서 한 번 생성된 배열의 크기는 변경이 불가능합니다.
그래서 배열 생성시 크기를 알맞게 넣어주어야 합니다.

배열 생성시 비어있는 배열로 선언하게 될 경우

**Primitive Type**의 배열을 생성한다면 메모리상에 생성된 공간에는 Type별 Default값이 생성이 됩니다.
```java 
int[] nums = new int[4];//[0,0,0,0]
boolean[] flags = new boolean[4]; //[false, false, false, false]
String[] strs = new String[4]; //[null, null, null, null];
```

**Reference Type**의 배열을 생성한다면 기본 값으로 null로 초기화 됩니다.

### 배열의 원소 접근

```java 
int[] nums = new int[4];
nums[0] = 1;
nums[1] = 2;
nums[2] = 3;
nums[3] = 4;
```
배열을 생성한 후 인덱스값을 통해 배열에 있는 공간에 접근할 수 있으며 인덱스값은 0 부터 배열의 길이 - 1까지 지정 가능합니다.

배열의 원소에 접근할 때 O(1)의 시간복잡도를 갖습니다.

### 배열에서 사용가능한 Method
```java
int[] nums = {1,2,3,4};
System.out.println(nums.length); //4

int[] numsClone = nums.clone();
for(int i = 0; i < numsClone.length; i++){
    System.out.print(numsClone[i] + " ");
}  // 1 2 3 4
```

배열에서 사용가능한 대표적인 Method는 length, clone이 있다.

**length** : 배열의 길이를 반환한다.  
**clone** : 배열을 복사해서 반환한다.  



