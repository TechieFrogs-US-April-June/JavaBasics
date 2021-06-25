package SirishaWork.src.EncapsulationAssignment;

       class Iclass {
            public int i;
            public void printNum(){
                System.out.println("I value: "+i);
            }
        }

        class Jclass extends Iclass {
            public int j;

            public void printNum() {
                super.printNum();
                System.out.println("J value: " + j);
            }
        }
