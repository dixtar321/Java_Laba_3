# Java_Laba_3
Напишите класс Matrix, реализующий матрицы и расширяющий его класс SquareMatrix, реализующий квадратные матрицы. В классах должны быть определены:
	
конструкторы с параметрами размерами матриц, создающие нулевую матрицу для Matrix и единичную для SquareMatrix;
методы Matrix sum(Matrix) и Matrix product(Matrix), вычисляющие сумму и произведение матриц; метод sum должен быть переопределен в SquareMatrix;
методы setElement(int row, int column, int value) и getElement(int row,  int column), для обращения к элементам  матрицы;
метод 	toString().

Напишите собственный класс исключения, расширяющий (наследующий) класс RuntimeException. Во всех конструкторах и методах должны бросаться исключения в тех случаях, когда соответствующая операция невозможна (например, при сложении матриц разных размеров). Исключения должны содержать информацию о том, какая именно проблема возникла. Достаточно хранить эту информацию в виде строки, возвращаемой методом getMessage().
