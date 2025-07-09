package rocks.zipcode.dreamhouse;

import java.awt.Color;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle moon;
    private Rectangles rect;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        
 wall = new Square();
        wall.moveVertical(95);
        wall.changeSize(600);
        wall.changeColor("red");
        wall.makeVisible();
       
        roof = new Triangle();
        roof.changeSize(70,200);
        roof.moveHorizontal(110);
        roof.moveVertical(60);
        roof.changeColor("magenta");
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(70,200);
        roof.moveHorizontal(310);
        roof.moveVertical(60);
        roof.changeColor("magenta");
        roof.makeVisible();

        roof = new Triangle();
        roof.changeSize(70,200);
        roof.moveHorizontal(510);
        roof.moveVertical(60);
        roof.changeColor("magenta");
        roof.makeVisible();

       

        moon = new Circle();
        moon.changeColor("white");
        moon.moveHorizontal(20);
        moon.moveVertical(-60);
        moon.changeSize(80);
        moon.makeVisible();

        moon = new Circle();
        moon.changeColor("black");
        moon.moveHorizontal(40);
        moon.moveVertical(-60);
        moon.changeSize(80);
        moon.makeVisible();

         moon = new Circle();
        moon.changeColor("white");
        moon.moveHorizontal(189);
        moon.moveVertical(-60);
        moon.changeSize(18);
        moon.makeVisible();

         moon = new Circle();
        moon.changeColor("white");
        moon.moveHorizontal(167);
        moon.moveVertical(-60);
        moon.changeSize(12);
        moon.makeVisible();

        moon = new Circle();
        moon.changeColor("white");
        moon.moveHorizontal(89);
        moon.moveVertical(-60);
        moon.changeSize(15);
        moon.makeVisible();

         moon = new Circle();
        moon.changeColor("white");
        moon.moveHorizontal(523);
        moon.moveVertical(-60);
        moon.changeSize(15);
        moon.makeVisible();

         moon = new Circle();
        moon.changeColor("white");
        moon.moveHorizontal(376);
        moon.moveVertical(-69);
        moon.changeSize(15);
        moon.makeVisible();

         moon = new Circle();
        moon.changeColor("white");
        moon.moveHorizontal(700);
        moon.moveVertical(-65);
        moon.changeSize(13);
        moon.makeVisible();

        moon = new Circle();
        moon.changeColor("white");
        moon.moveHorizontal(643);
        moon.moveVertical(-100);
        moon.changeSize(13);
        moon.makeVisible();

        moon = new Circle();
        moon.changeColor("white");
        moon.moveHorizontal(876);
        moon.moveVertical(-50);
        moon.changeSize(18);
        moon.makeVisible();

         moon = new Circle();
        moon.changeColor("white");
        moon.moveHorizontal(876);
        moon.moveVertical(-26);
        moon.changeSize(18);
        moon.makeVisible();


        moon = new Circle();
        moon.changeColor("white");
        moon.moveHorizontal(754);
        moon.moveVertical(-47);
        moon.changeSize(18);
        moon.makeVisible();

        moon = new Circle();
        moon.changeColor("white");
        moon.moveHorizontal(465);
        moon.moveVertical(-35);
        moon.changeSize(14);
        moon.makeVisible();

        moon = new Circle();
        moon.changeColor("white");
        moon.moveHorizontal(550);
        moon.moveVertical(-24);
        moon.changeSize(14);
        moon.makeVisible();

        moon = new Circle();
        moon.changeColor("white");
        moon.moveHorizontal(200);
        moon.moveVertical(-30);
        moon.changeSize(14);
        moon.makeVisible();










         window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(100);
        window.moveVertical(400);
        window.makeVisible();

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(200);
        window.moveVertical(400);
        window.makeVisible();

         window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(300);
        window.moveVertical(400);
        window.makeVisible();

          window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(400);
        window.moveVertical(400);
        window.makeVisible();

         window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(1);
        window.moveVertical(400);
        window.makeVisible();

           window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(400);
        window.moveVertical(300);
        window.makeVisible();

          window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(300);
        window.moveVertical(300);
        window.makeVisible();

          window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(200);
        window.moveVertical(300);
        window.makeVisible();

         window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(100);
        window.moveVertical(300);
        window.makeVisible();

         window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(1);
        window.moveVertical(300);
        window.makeVisible();

         window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(100);
        window.moveVertical(200);
        window.makeVisible();

         window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(200);
        window.moveVertical(200);
        window.makeVisible();

         window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(300);
        window.moveVertical(200);
        window.makeVisible();

         window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(400);
        window.moveVertical(200);
        window.makeVisible();

         window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(1);
        window.moveVertical(200);
        window.makeVisible();

          window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(1);
        window.moveVertical(100);
        window.makeVisible();

           window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(100);
        window.moveVertical(100);
        window.makeVisible();

         window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(200);
        window.moveVertical(100);
        window.makeVisible();

         window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(300);
        window.moveVertical(100);
        window.makeVisible();

          window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(540);
        window.moveVertical(500);
        window.makeVisible();


          window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(400);
        window.moveVertical(100);
        window.makeVisible();

         window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(540);
        window.moveVertical(100);
        window.makeVisible();

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(540);
        window.moveVertical(200);
        window.makeVisible();

         window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(540);
        window.moveVertical(300);
        window.makeVisible();

         window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(540);
        window.moveVertical(400);
        window.makeVisible();

          window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(300);
        window.moveVertical(600);
        window.makeVisible();

         window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(300);
        window.moveVertical(550);
        window.makeVisible();

        moon = new Circle();
        moon.changeColor("white");
        moon.moveHorizontal(383);
        moon.moveVertical(580);
        moon.changeSize(14);
        moon.makeVisible();

         window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(700);
        window.moveVertical(550);
        window.changeSize(20);
        window.makeVisible();

         window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(700);
        window.moveVertical(570);
        window.changeSize(20);
        window.makeVisible();

         window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(700);
        window.moveVertical(590);
        window.changeSize(20);
        window.makeVisible();

         window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(700);
        window.moveVertical(610);
        window.changeSize(20);
        window.makeVisible();

         window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(700);
        window.moveVertical(630);
        window.changeSize(20);
        window.makeVisible();

          window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(700);
        window.moveVertical(650);
        window.changeSize(20);
        window.makeVisible();

          moon = new Circle();
        moon.changeColor("yellow");
        moon.moveHorizontal(735);
        moon.moveVertical(510);
        moon.changeSize(30);
        moon.makeVisible();

           moon = new Circle();
        moon.changeColor("yellow");
        moon.moveHorizontal(850);
        moon.moveVertical(510);
        moon.changeSize(30);
        moon.makeVisible();

         window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(815);
        window.moveVertical(550);
        window.changeSize(20);
        window.makeVisible();

         window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(815);
        window.moveVertical(570);
        window.changeSize(20);
        window.makeVisible();

         window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(815);
        window.moveVertical(590);
        window.changeSize(20);
        window.makeVisible();

         window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(815);
        window.moveVertical(610);
        window.changeSize(20);
        window.makeVisible();

         window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(815);
        window.moveVertical(630);
        window.changeSize(20);
        window.makeVisible();

        window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(815);
        window.moveVertical(650);
        window.changeSize(20);
        window.makeVisible();

        rect = new Rectangles();
        rect.changeColor("blue");
        rect.moveHorizontal(599);
        rect.moveVertical(150);
        rect.changeSize(50,10);
        rect.makeVisible();

         rect = new Rectangles();
        rect.changeColor("blue");
        rect.moveHorizontal(650);
        rect.moveVertical(130);
        rect.changeSize(10,30);
        rect.makeVisible();

        rect = new Rectangles();
        rect.changeColor("blue");
        rect.moveHorizontal(599);
        rect.moveVertical(255);
        rect.changeSize(50,10);
        rect.makeVisible();

         rect = new Rectangles();
        rect.changeColor("blue");
        rect.moveHorizontal(650);
        rect.moveVertical(235);
        rect.changeSize(10,30);
        rect.makeVisible();

        rect = new Rectangles();
        rect.changeColor("blue");
        rect.moveHorizontal(599);
        rect.moveVertical(350);
        rect.changeSize(50,10);
        rect.makeVisible();

        rect = new Rectangles();
        rect.changeColor("blue");
        rect.moveHorizontal(650);
        rect.moveVertical(330);
        rect.changeSize(10,30);
        rect.makeVisible();

         rect = new Rectangles();
        rect.changeColor("blue");
        rect.moveHorizontal(599);
        rect.moveVertical(450);
        rect.changeSize(50,10);
        rect.makeVisible();

         rect = new Rectangles();
        rect.changeColor("blue");
        rect.moveHorizontal(650);
        rect.moveVertical(430);
        rect.changeSize(10,30);
        rect.makeVisible();

         rect = new Rectangles();
        rect.changeColor("blue");
        rect.moveHorizontal(599);
        rect.moveVertical(550);
        rect.changeSize(27,10);
        rect.makeVisible();

         rect = new Rectangles();
        rect.changeColor("blue");
        rect.moveHorizontal(620);
        rect.moveVertical(560);
        rect.changeSize(27,10);
        rect.makeVisible();

         rect = new Rectangles();
        rect.changeColor("blue");
        rect.moveHorizontal(640);
        rect.moveVertical(570);
        rect.changeSize(27,10);
        rect.makeVisible();

         rect = new Rectangles();
        rect.changeColor("blue");
        rect.moveHorizontal(660);
        rect.moveVertical(580);
        rect.changeSize(27,10);
        rect.makeVisible();

         rect = new Rectangles();
        rect.changeColor("blue");
        rect.moveHorizontal(680);
        rect.moveVertical(590);
        rect.changeSize(27,10);
        rect.makeVisible();

          rect = new Rectangles();
        rect.changeColor("blue");
        rect.moveHorizontal(700);
        rect.moveVertical(600);
        rect.changeSize(27,10);
        rect.makeVisible();

         rect = new Rectangles();
        rect.changeColor("blue");
        rect.moveHorizontal(720);
        rect.moveVertical(610);
        rect.changeSize(27,10);
        rect.makeVisible();

         rect = new Rectangles();
        rect.changeColor("blue");
        rect.moveHorizontal(740);
        rect.moveVertical(620);
        rect.changeSize(27,10);
        rect.makeVisible();

          rect = new Rectangles();
        rect.changeColor("blue");
        rect.moveHorizontal(760);
        rect.moveVertical(630);
        rect.changeSize(27,10);
        rect.makeVisible();

          rect = new Rectangles();
        rect.changeColor("blue");
        rect.moveHorizontal(780);
        rect.moveVertical(640);
        rect.changeSize(27,10);
        rect.makeVisible();













         










         





        













         

    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            moon.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            moon.changeColor("yellow");
        }
    }

}
