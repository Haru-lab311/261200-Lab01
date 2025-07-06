
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Turtle bob = new Turtle();

        bob.up();
        bob.setPosition(-200, -200);

        //bamboo
        bob.left(90);
        for (int i = 30; i > 0; i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(18);
            bob.right(3);

        }
        //1
        //move
        bob.up();
        bob.right(90);
        bob.forward(350);
        bob.right(90);
        bob.forward(340);
        bob.right(90);
        bob.forward(50);
        bob.right(45);

        //limb
        for (int i = 10; i > 0; i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(17.5);
            bob.right(3);

        }

        //Tanzaku
        bob.penColor("black");
        bob.width(1);
        bob.forward(10);

        bob.penColor("blue");
        for (int i = 0; i < 2; i++) {
            bob.width(3);
            bob.forward(40);
            bob.right(90);
            bob.forward(15);
            bob.right(90);
        }
        bob.penColor("black");
        bob.backward(10);

        //move
        bob.up();
        bob.right(90);
        bob.forward(50);
        bob.right(100);
        bob.forward(130);
        bob.right(170);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(8);
            bob.right(8);
        }

        //leaf
        bob.penColor("green");
        bob.down();
        bob.width(3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 60; j++) {
                bob.forward(1);
                bob.left(1);
            }
            bob.left(120);
        }

        //move
        bob.up();
        bob.left(160);
        bob.forward(21);
        bob.right(90);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(8);
            bob.right(8);

        }

        //leaf
        bob.penColor("green");
        bob.down();
        bob.width(3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 60; j++) {
                bob.forward(1);
                bob.left(1);
            }
            bob.left(120);
        }

        //move
        bob.up();
        bob.right(100);
        bob.forward(8);
        bob.left(80);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(8);
            bob.right(8);

        }

        //leaf
        bob.penColor("green");
        bob.down();
        bob.width(3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 60; j++) {
                bob.forward(1);
                bob.left(1);
            }
            bob.left(120);
        }

        //move
        bob.up();
        bob.left(180);
        bob.forward(22);
        bob.right(90);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(8);
            bob.right(8);

        }

        //leaf
        bob.penColor("green");
        bob.down();
        bob.width(3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 60; j++) {
                bob.forward(1);
                bob.left(1);
            }
            bob.left(120);
        }

        //move
        bob.up();
        bob.right(140);
        bob.forward(20);
        bob.left(90);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(5);
            bob.right(3);

        }
        //Tanzaku
        bob.penColor("black");
        bob.width(1);
        bob.forward(10);
        bob.penColor("brown");
        for (int i = 0; i < 2; i++) {
            bob.width(3);
            bob.forward(40);
            bob.right(90);
            bob.forward(15);
            bob.right(90);
        }
        bob.penColor("black");
        bob.backward(10);

        //2
        //move
        bob.up();
        bob.left(79);
        bob.forward(45);
        bob.right(40);
        bob.left(160);
        bob.forward(110);
        bob.right(90);

        //limb
        for (int i = 10; i > 0; i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(17.5);
            bob.right(3);

        }

        //leaf
        bob.penColor("green");
        bob.down();
        bob.width(3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 60; j++) {
                bob.forward(1);
                bob.left(1);
            }
            bob.left(120);
        }

        //move
        bob.up();
        bob.right(90);
        bob.forward(50);
        bob.right(100);
        bob.forward(130);
        bob.right(170);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(8);
            bob.right(8);
        }

        //Tanzaku
        bob.penColor("black");
        bob.width(1);
        bob.forward(10);
        bob.penColor("green");
        for (int i = 0; i < 2; i++) {
            bob.width(3);
            bob.forward(40);
            bob.right(90);
            bob.forward(15);
            bob.right(90);
        }
        bob.penColor("black");
        bob.backward(10);

        //move
        bob.up();
        bob.left(160);
        bob.forward(21);
        bob.right(90);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(8);
            bob.right(8);

        }

        //leaf
        bob.penColor("green");
        bob.down();
        bob.width(3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 60; j++) {
                bob.forward(1);
                bob.left(1);
            }
            bob.left(120);
        }

        //move
        bob.up();
        bob.right(100);
        bob.forward(8);
        bob.left(80);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(8);
            bob.right(8);

        }

        //move
        bob.up();
        bob.left(180);
        bob.forward(22);
        bob.right(90);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(8);
            bob.right(8);

        }

        //leaf
        bob.penColor("green");
        bob.down();
        bob.width(3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 60; j++) {
                bob.forward(1);
                bob.left(1);
            }
            bob.left(120);
        }

        //move
        bob.up();
        bob.right(140);
        bob.forward(20);
        bob.left(90);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(5);
            bob.right(3);

        }

        //Tanzaku
        bob.penColor("black");
        bob.width(1);
        bob.forward(10);
        bob.penColor("red");
        for (int i = 0; i < 2; i++) {
            bob.width(3);
            bob.forward(40);
            bob.right(90);
            bob.forward(15);
            bob.right(90);
        }
        bob.penColor("black");
        bob.backward(10);

        //3
        //move
        bob.up();
        bob.left(79);
        bob.forward(45);
        bob.right(40);
        bob.right(100);
        bob.forward(40);
        bob.left(80);

        //limb
        for (int i = 10; i > 0; i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(17.5);
            bob.right(3);

        }

        //move
        bob.up();
        bob.right(90);
        bob.forward(50);
        bob.right(100);
        bob.forward(130);
        bob.right(170);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(8);
            bob.right(8);
        }

        //leaf
        bob.penColor("green");
        bob.down();
        bob.width(3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 60; j++) {
                bob.forward(1);
                bob.left(1);
            }
            bob.left(120);
        }

        //move
        bob.up();
        bob.left(160);
        bob.forward(21);
        bob.right(90);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(8);
            bob.right(8);

        }

        //leaf
        bob.penColor("green");
        bob.down();
        bob.width(3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 60; j++) {
                bob.forward(1);
                bob.left(1);
            }
            bob.left(120);
        }

        //move
        bob.up();
        bob.right(100);
        bob.forward(8);
        bob.left(80);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(8);
            bob.right(8);

        }

        //leaf
        bob.penColor("green");
        bob.down();
        bob.width(3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 60; j++) {
                bob.forward(1);
                bob.left(1);
            }
            bob.left(120);
        }

        //move
        bob.up();
        bob.left(180);
        bob.forward(22);
        bob.right(90);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(8);
            bob.right(8);

        }

        //leaf
        bob.penColor("green");
        bob.down();
        bob.width(3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 60; j++) {
                bob.forward(1);
                bob.left(1);
            }
            bob.left(120);
        }

        //move
        bob.up();
        bob.right(140);
        bob.forward(20);
        bob.left(90);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(5);
            bob.right(3);

        }

        //Tanzaku
        bob.penColor("black");
        bob.width(1);
        bob.forward(10);
        bob.penColor("purple");
        for (int i = 0; i < 2; i++) {
            bob.width(3);
            bob.forward(40);
            bob.right(90);
            bob.forward(15);
            bob.right(90);
        }
        bob.penColor("black");
        bob.backward(10);

        //4
        //move
        bob.up();
        bob.left(79);
        bob.forward(45);
        bob.right(40);
        bob.left(180);
        bob.forward(100);
        bob.right(90);

        //limb
        for (int i = 10; i > 0; i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(17.5);
            bob.right(3);

        }

        //leaf
        bob.penColor("green");
        bob.down();
        bob.width(3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 60; j++) {
                bob.forward(1);
                bob.left(1);
            }
            bob.left(120);
        }

        //move
        bob.up();
        bob.right(90);
        bob.forward(50);
        bob.right(100);
        bob.forward(130);
        bob.right(170);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(8);
            bob.right(8);
        }

        //leaf
        bob.penColor("green");
        bob.down();
        bob.width(3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 60; j++) {
                bob.forward(1);
                bob.left(1);
            }
            bob.left(120);
        }

        //move
        bob.up();
        bob.left(160);
        bob.forward(21);
        bob.right(90);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(8);
            bob.right(8);

        }

        //leaf
        bob.penColor("green");
        bob.down();
        bob.width(3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 60; j++) {
                bob.forward(1);
                bob.left(1);
            }
            bob.left(120);
        }

        //move
        bob.up();
        bob.right(100);
        bob.forward(8);
        bob.left(80);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(8);
            bob.right(8);

        }

        //leaf
        bob.penColor("green");
        bob.down();
        bob.width(3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 60; j++) {
                bob.forward(1);
                bob.left(1);
            }
            bob.left(120);
        }

        //move
        bob.up();
        bob.left(180);
        bob.forward(22);
        bob.right(90);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(8);
            bob.right(8);

        }

        //leaf
        bob.penColor("green");
        bob.down();
        bob.width(3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 60; j++) {
                bob.forward(1);
                bob.left(1);
            }
            bob.left(120);
        }

        //move
        bob.up();
        bob.right(140);
        bob.forward(20);
        bob.left(90);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(5);
            bob.right(3);

        }

        //Tanzaku
        bob.penColor("black");
        bob.width(1);
        bob.forward(10);
        bob.penColor("firebrick");
        for (int i = 0; i < 2; i++) {
            bob.width(3);
            bob.forward(40);
            bob.right(90);
            bob.forward(15);
            bob.right(90);
        }
        bob.penColor("black");
        bob.backward(10);

        //move
        bob.up();
        bob.left(79);
        bob.forward(45);
        bob.right(40);
        bob.right(140);
        bob.forward(135);
        bob.left(90);

        //limb
        for (int i = 8; i > 0; i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(17.5);
            bob.right(3);
        }

        //move
        bob.up();
        bob.right(90);
        bob.forward(50);
        bob.right(100);
        bob.forward(130);
        bob.right(170);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(8);
            bob.right(8);
        }

        //leaf
        bob.penColor("green");
        bob.down();
        bob.width(3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 60; j++) {
                bob.forward(1);
                bob.left(1);
            }
            bob.left(120);
        }

        //move
        bob.up();
        bob.left(160);
        bob.forward(21);
        bob.right(90);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(8);
            bob.right(8);

        }

        //Tanzaku
        bob.penColor("black");
        bob.width(1);
        bob.forward(10);
        bob.penColor("navy");
        for (int i = 0; i < 2; i++) {
            bob.width(3);
            bob.forward(40);
            bob.right(90);
            bob.forward(15);
            bob.right(90);
        }
        bob.penColor("black");
        bob.backward(10);

        //move
        bob.up();
        bob.right(100);
        bob.forward(8);
        bob.left(80);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(8);
            bob.right(8);

        }

        //Tanzaku
        bob.penColor("black");
        bob.width(1);
        bob.forward(10);
        bob.penColor("gray");
        for (int i = 0; i < 2; i++) {
            bob.width(3);
            bob.forward(40);
            bob.right(90);
            bob.forward(15);
            bob.right(90);
        }
        bob.penColor("black");
        bob.backward(10);

        //move
        bob.up();
        bob.left(180);
        bob.forward(22);
        bob.right(90);

        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(8);
            bob.right(8);

        }

        //leaf
        bob.penColor("green");
        bob.down();
        bob.width(3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 60; j++) {
                bob.forward(1);
                bob.left(1);
            }
            bob.left(120);
        }

        //move
        bob.up();
        bob.right(140);
        bob.forward(20);
        bob.left(90);
        //twig
        for(int i = 4; i>0;i--) {
            bob.down();
            bob.penColor("yellowgreen");
            bob.width(i);
            bob.forward(5);
            bob.right(3);

        }

        //move
        bob.up();
        bob.left(79);
        bob.forward(45);
        bob.right(40);
        bob.down();

        // Tanzaku
        bob.penColor("black");
        bob.width(1);
        bob.forward(10);
        bob.penColor("red");
        for (int i = 0; i < 2; i++) {
            bob.width(3);
            bob.forward(40);
            bob.right(90);
            bob.forward(15);
            bob.right(90);
        }
        bob.backward(10);
    }
    }
