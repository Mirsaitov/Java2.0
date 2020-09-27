package Homework7;


/**
     *  Логика работы калькулятора
     */
    public class Logic {
        /** Первое значение */
        private Operand leftOperand;
        /** Второе значение  */
        private Operand rightOperand;
        /** Оператор  выражения */
        private Operation operation;

        /** Конструктор класса Logic */
        Logic(Operand leftOperand, Operand rightOperand, Operation operation) {
            this.leftOperand = leftOperand;
            this.rightOperand = rightOperand;
            this.operation = operation;
        }
        /** определение выражения и возврат результата */
        double getResult() {
            double result = 0;

            switch (operation) {
                case plus: {
                    result = leftOperand.getValue() + rightOperand.getValue();
                    break;
                }
                case minus: {
                    result = leftOperand.getValue() - rightOperand.getValue();
                    break;
                }
                case multip: {
                    result = leftOperand.getValue() * rightOperand.getValue();
                    break;
                }
                case divis: {
                    result = leftOperand.getValue() / rightOperand.getValue();
                    break;
                }
            }
            return result;
        }
    }

