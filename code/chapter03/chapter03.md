# 基本数据类型和 String 类型的转换
## 基本数据类型转换为String类型
只需要基本数据类型的值+ ""即可
## String类型转换为基本数据类型
String str = "123";
int num1 = Interger.parseInt(str);
double num2 = Double.parseDouble(str);
### 字符串转成字符 char
只需要str.charAt(x),x表示是字符串的第几个字符