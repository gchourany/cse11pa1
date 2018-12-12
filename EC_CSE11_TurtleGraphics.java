/*
 * Filename: EC_CSE11_TurtleGraphics.java
 * Author:   Gabrielle Hourany      
 * UserId:   cs11fafg         
 * Date:     9/27/2018
 * Sources of Help: none      
 */

import turtleClasses.*;
import java.awt.Color;

/**
 * Creates a turtle that draws text using seven-segment displays.
 */
public class EC_CSE11_TurtleGraphics extends Turtle {

  // Pen width; also used for scaling displays and segments
  private static final int PEN_WIDTH = 6;

  // Width/Length of each segment including spacing on each side of segment
  private static final int SEGMENT_LENGTH = 20 * PEN_WIDTH / 2;

  // Overall height of a single seven-segment display
  private static final int DISPLAY_HEIGHT = SEGMENT_LENGTH * 2;

  // Space between each seven-segment display
  private static final int DISPLAY_SPACING = 10 * PEN_WIDTH / 2;

  private static final int DISPLAYS_PER_LINE = 10;
  private static final int LINES = 3;

  // World dimensions
  private static final int WORLD_WIDTH =
      DISPLAYS_PER_LINE * SEGMENT_LENGTH +
      (DISPLAYS_PER_LINE - 1) * DISPLAY_SPACING;
  private static final int WORLD_HEIGHT =
      LINES * DISPLAY_HEIGHT + (LINES - 1) * DISPLAY_SPACING;

  // Space/Offset (in pixels) on each side of the segment
  private static final int SEG_A_OFFSET = 1 * PEN_WIDTH;
  private static final int SEG_B_OFFSET = 2 * PEN_WIDTH;
  private static final int SEG_C_OFFSET = 2 * PEN_WIDTH;
  private static final int SEG_D_OFFSET = 1 * PEN_WIDTH;
  private static final int SEG_E_OFFSET = 2 * PEN_WIDTH;
  private static final int SEG_F_OFFSET = 2 * PEN_WIDTH;
  private static final int SEG_G_OFFSET = 1 * PEN_WIDTH;

  // Length (in pixels) of each individual segment that gets lit up
  private static final int SEG_A_LENGTH = SEGMENT_LENGTH - (SEG_A_OFFSET * 2);
  private static final int SEG_B_LENGTH = SEGMENT_LENGTH - (SEG_B_OFFSET * 2);
  private static final int SEG_C_LENGTH = SEGMENT_LENGTH - (SEG_C_OFFSET * 2);
  private static final int SEG_D_LENGTH = SEGMENT_LENGTH - (SEG_D_OFFSET * 2);
  private static final int SEG_E_LENGTH = SEGMENT_LENGTH - (SEG_E_OFFSET * 2);
  private static final int SEG_F_LENGTH = SEGMENT_LENGTH - (SEG_F_OFFSET * 2);
  private static final int SEG_G_LENGTH = SEGMENT_LENGTH - (SEG_G_OFFSET * 2);

  // Color of a segment when on
  private static final Color SEGMENT_ON_COLOR = Color.PINK;

  // Color of a segment when off
  private static final int VERY_DARK_GRAY = 30;
  private static final Color SEGMENT_OFF_COLOR =
      new Color( VERY_DARK_GRAY, VERY_DARK_GRAY, VERY_DARK_GRAY );

  // Starting x offset for line 1
  private static final int START_X = 40;

  // Starting y offset for line 1
  private static final int START_Y = 40;

  // Delay in milliseconds between each turtle action
  private static final int DELAY = 20;


  /**
   * Creates a new turtle in the world.
   *
   * @param world the world that the turtle will be created in
   * @param delay the delay in milliseconds between the turtle's actions
   */
  public EC_CSE11_TurtleGraphics( World world, int delay ) {
    // Invoke superclass's ctor to create this turtle
    super( world, delay );
  }


  /**
   * Creates a turtle on a world and instructs it to draw text.
   *
   * @param args the command line arguments passed in (not used)
   */
  public static void main( String[] args ) {

    // Initialize the world that the turtle will draw on
    World world = new World( WORLD_WIDTH + START_X + START_X,
                             WORLD_HEIGHT + START_Y + START_Y );

    // Set background to black
    Picture background = new Picture( WORLD_WIDTH + START_X + START_X,
                                      WORLD_HEIGHT + START_Y + START_Y );
    background.setAllPixelsToAColor( Color.BLACK );
    world.setPicture( background );

    // Create a new turtle to do the drawing
    EC_CSE11_TurtleGraphics myTurtle = new EC_CSE11_TurtleGraphics( world, DELAY );
    myTurtle.setPenWidth( PEN_WIDTH );


    // Line 1 - Display PA 1

    // x,y is the upper-left corner of the seven segment display to render
    int x = START_X;
    int y = START_Y;

    myTurtle.drawGap( x, y );

    // Change x to start position of next seven-segment display on this line
    x = x + SEGMENT_LENGTH + DISPLAY_SPACING;
    myTurtle.drawGap( x, y );

    x = x + SEGMENT_LENGTH + DISPLAY_SPACING; //Spaces out #s
    myTurtle.drawGap( x, y);

    x = x + SEGMENT_LENGTH + DISPLAY_SPACING; //Spaces out #s
    myTurtle.drawP( x, y );

    x = x + SEGMENT_LENGTH + DISPLAY_SPACING; //Spaces out #s
    myTurtle.drawA( x, y );

    x = x + SEGMENT_LENGTH + DISPLAY_SPACING; //Spaces out #s
    myTurtle.drawGap( x, y );

    x = x + SEGMENT_LENGTH + DISPLAY_SPACING; //Spaces out #s
    myTurtle.draw1( x, y );

    x = x + SEGMENT_LENGTH + DISPLAY_SPACING; //Spaces out #s
    myTurtle.drawGap( x, y );

    x = x + SEGMENT_LENGTH + DISPLAY_SPACING; //Spaces out #s
    myTurtle.drawGap( x, y );

    x = x + SEGMENT_LENGTH + DISPLAY_SPACING; //Spaces out #s
    myTurtle.drawGap( x, y );

    // Line 2 - Display CONCLUSION
    
    y = y + DISPLAY_HEIGHT + DISPLAY_SPACING; //Moves start point to line 2
    myTurtle.drawN( x, y );

    x = x - SEGMENT_LENGTH - DISPLAY_SPACING; //Moves start position left
    myTurtle.draw0( x, y );

    x = x - SEGMENT_LENGTH - DISPLAY_SPACING; //Moves start position left
    myTurtle.drawI( x, y );

    x = x - SEGMENT_LENGTH - DISPLAY_SPACING; //Moves start position left
    myTurtle.draw5( x, y );

    x = x - SEGMENT_LENGTH - DISPLAY_SPACING; //Moves start position left
    myTurtle.drawU( x, y );

    x = x - SEGMENT_LENGTH - DISPLAY_SPACING; //Moves start position left
    myTurtle.drawL( x, y );

    x = x - SEGMENT_LENGTH - DISPLAY_SPACING; //Moves start position left
    myTurtle.drawC( x, y );

    x = x - SEGMENT_LENGTH - DISPLAY_SPACING; //Moves start position left
    myTurtle.drawN( x, y );

    x = x - SEGMENT_LENGTH - DISPLAY_SPACING; //Moves start position left
    myTurtle.draw0( x, y ); // 5 and S are identical in seven-segment displays

    x = x - SEGMENT_LENGTH - DISPLAY_SPACING; //Moves start position left
    myTurtle.drawC( x, y );

    // Line 3 - Display SIGHT -BYE

    y = y + DISPLAY_HEIGHT + DISPLAY_SPACING; //Moves start point to line 3
    myTurtle.draw5( x, y ); // 5 and S are identical in seven-segment displays

    x = x + SEGMENT_LENGTH + DISPLAY_SPACING; //Moves start position right
    myTurtle.drawI( x, y );

    x = x + SEGMENT_LENGTH + DISPLAY_SPACING; //Moves start position right
    myTurtle.draw9( x, y );

    x = x + SEGMENT_LENGTH + DISPLAY_SPACING; //Moves start position right
    myTurtle.drawH( x, y ); 

    x = x + SEGMENT_LENGTH + DISPLAY_SPACING; //Moves start position right
    myTurtle.drawT( x, y );

    x = x + SEGMENT_LENGTH + DISPLAY_SPACING; //Moves start position right
    myTurtle.drawGap( x, y );

    x = x + SEGMENT_LENGTH + DISPLAY_SPACING; //Moves start position right
    myTurtle.drawDash( x, y );

    x = x + SEGMENT_LENGTH + DISPLAY_SPACING; //Moves start position right
    myTurtle.drawB( x, y ); // 9 and G are identical in seven segment displays

    x = x + SEGMENT_LENGTH + DISPLAY_SPACING; //Moves start position right
    myTurtle.drawY( x, y ); // 0 and o are identical in seven segment displays

    x = x + SEGMENT_LENGTH + DISPLAY_SPACING; //MOves start position right
    myTurtle.drawE( x, y );

    // Hide the turtle after the text is drawn
    myTurtle.setVisible( false );

  } // End main()

  /**
   * Draws segment A of a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param color the color to draw this segment of the seven-segment display
   */
  public void drawSegmentA( int x, int y, Color color ) {
    penUp();
    moveTo( x, y );
    turnToFace( getXPos() + 1, getYPos() );  // Face right
    forward( SEG_A_OFFSET );  // Skip offset # of pixels before drawing
    setPenColor( color );
    penDown();
    forward( SEG_A_LENGTH );
    penUp();
  }

  /**
   * Draws segment B of a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param color the color to draw this segment of the seven-segment display
   */
  public void drawSegmentB( int x, int y, Color color ) {
    penUp();
    moveTo( x + SEGMENT_LENGTH, y );
    turnToFace( getXPos(), getYPos() + 1 );  // Face down
    forward( SEG_B_OFFSET ); //Skip offset # of pixels before drawing
    setPenColor( color );
    penDown();
    forward( SEG_B_LENGTH );
    penUp();
  }

  /**
   * Draws Segment C of a seven-segmen display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param color the color to draw this segment of the seven-segment display
   */
  public void drawSegmentC( int x, int y, Color color ) { 
    penUp();
    moveTo( x + SEGMENT_LENGTH, y + SEGMENT_LENGTH );
    turnToFace( getXPos(), getYPos() + 1 ); // Face down
    forward( SEG_C_OFFSET ); //Skip offset # of pixels before drawing
    setPenColor( color );
    penDown();
    forward( SEG_C_LENGTH );
    penUp();
  }

  /**
   * Draws Segment D of a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment 
   *   display's bounding box
   * @param color the color to draw this segment of the seven-segment display
   */
  public void drawSegmentD( int x, int y, Color color ) {
    penUp();
    moveTo( x + SEGMENT_LENGTH, y + SEGMENT_LENGTH * 2 );
    turnToFace( getXPos() - 1, getYPos() ); // Face left
    forward( SEG_D_OFFSET ); //Skip offset # of pixels before drawing 
    setPenColor( color );
    penDown();
    forward( SEG_D_LENGTH );
    penUp();
  }

  /**
   * Draws Segment E of a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param color the color to draw this segment of the seven-segment display
   */
  public void drawSegmentE( int x, int y, Color color ) {
    penUp();
    moveTo( x, y + SEGMENT_LENGTH * 2 );
    turnToFace( getXPos(), getYPos() - 1 ); // Face up
    forward( SEG_E_OFFSET ); //Skip offset # of pixels before drawing
    setPenColor( color );
    penDown();
    forward( SEG_E_LENGTH );
    penUp();
  }

  /**
   * Draws Segment F of a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment 
   *   display's bounding box
   * @param color the color to draw this segment of the seven-segment display
   */
  public void drawSegmentF( int x, int y, Color color ) {
    penUp();
    moveTo( x, y + SEGMENT_LENGTH );
    turnToFace( getXPos(), getYPos() - 1 ); // Face up
    forward( SEG_F_OFFSET ); //Skip offset # of pixels before drawing
    setPenColor( color );
    penDown();
    forward( SEG_F_LENGTH );
    penUp();
  }

  /**
   * Draws Segment G of a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment 
   *   display's bounding box
   * @param color the color to draw this segment of the seven-segment display
   */
  public void drawSegmentG( int x, int y, Color color ) {
    penUp();
    moveTo( x, y + SEGMENT_LENGTH );
    turnToFace( getXPos() + 1 , getYPos() ); // Face right 
    forward( SEG_G_OFFSET ); //SKip offset # of pixels before drawing 
    setPenColor( color );
    penDown();
    forward( SEG_G_LENGTH );
    penUp();
  }

  /**
   * Draws all segments of a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param color the color to draw the segments of the seven-segment display
   */
  public void drawAllSegments( int x, int y, Color color ) {
    drawSegmentA( x, y, SEGMENT_ON_COLOR );
    drawSegmentB( x, y, SEGMENT_ON_COLOR );
    drawSegmentC( x, y, SEGMENT_ON_COLOR );
    drawSegmentD( x, y, SEGMENT_ON_COLOR );
    drawSegmentE( x, y, SEGMENT_ON_COLOR );
    drawSegmentF( x, y, SEGMENT_ON_COLOR );
    drawSegmentG( x, y, SEGMENT_ON_COLOR ); 
  }

  /**
   * Draws '0' using a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   */
  public void draw0( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_ON_COLOR );
    drawSegmentB( x, y, SEGMENT_ON_COLOR );
    drawSegmentC( x, y, SEGMENT_ON_COLOR );
    drawSegmentD( x, y, SEGMENT_ON_COLOR );
    drawSegmentE( x, y, SEGMENT_ON_COLOR );
    drawSegmentF( x, y, SEGMENT_ON_COLOR );
    drawSegmentG( x, y, SEGMENT_OFF_COLOR );
  }

  /**
   * Draws '1' using a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   */
  public void draw1( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_OFF_COLOR );
    drawSegmentB( x, y, SEGMENT_ON_COLOR );
    drawSegmentC( x, y, SEGMENT_ON_COLOR );
    drawSegmentD( x, y, SEGMENT_OFF_COLOR );
    drawSegmentE( x, y, SEGMENT_OFF_COLOR );
    drawSegmentF( x, y, SEGMENT_OFF_COLOR );
    drawSegmentG( x, y, SEGMENT_OFF_COLOR );
  }
 
  /**
   * Draws '2' using a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment 
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   */
  public void draw2( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_ON_COLOR );
    drawSegmentB( x, y, SEGMENT_ON_COLOR );
    drawSegmentC( x, y, SEGMENT_OFF_COLOR );
    drawSegmentD( x, y, SEGMENT_ON_COLOR );
    drawSegmentE( x, y, SEGMENT_ON_COLOR );
    drawSegmentF( x, y, SEGMENT_OFF_COLOR );
    drawSegmentG( x, y, SEGMENT_ON_COLOR );
  }

  /**
   * Draws '3' using a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment 
   *   display's bounding box
   */
  public void draw3( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_ON_COLOR );
    drawSegmentB( x, y, SEGMENT_ON_COLOR );
    drawSegmentC( x, y, SEGMENT_ON_COLOR );
    drawSegmentD( x, y, SEGMENT_ON_COLOR );
    drawSegmentE( x, y, SEGMENT_OFF_COLOR );
    drawSegmentF( x, y, SEGMENT_OFF_COLOR );
    drawSegmentG( x, y, SEGMENT_ON_COLOR );
  }

  /**
   * Drawa '4' using a seven-segment display. 
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment 
   *   display's bounding box
   */
  public void draw4( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_OFF_COLOR );
    drawSegmentB( x, y, SEGMENT_ON_COLOR );
    drawSegmentC( x, y, SEGMENT_ON_COLOR );
    drawSegmentD( x, y, SEGMENT_OFF_COLOR );
    drawSegmentE( x, y, SEGMENT_OFF_COLOR );
    drawSegmentF( x, y, SEGMENT_ON_COLOR );
    drawSegmentG( x, y, SEGMENT_ON_COLOR );
  }

  /**
   * Draws '5' using a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment 
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   */
  public void draw5( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_ON_COLOR );
    drawSegmentB( x, y, SEGMENT_OFF_COLOR );
    drawSegmentC( x, y, SEGMENT_ON_COLOR );
    drawSegmentD( x, y, SEGMENT_ON_COLOR );
    drawSegmentE( x, y, SEGMENT_OFF_COLOR );
    drawSegmentF( x, y, SEGMENT_ON_COLOR );
    drawSegmentG( x, y, SEGMENT_ON_COLOR );
  }

  /**
   * Draws '6' using a seven-segment display. 
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment 
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   */
  public void draw6( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_ON_COLOR );
    drawSegmentB( x, y, SEGMENT_OFF_COLOR );
    drawSegmentC( x, y, SEGMENT_ON_COLOR );
    drawSegmentD( x, y, SEGMENT_ON_COLOR );
    drawSegmentE( x, y, SEGMENT_ON_COLOR );
    drawSegmentF( x, y, SEGMENT_ON_COLOR );
    drawSegmentG( x, y, SEGMENT_ON_COLOR );
  }

  /**
   * Draws '7' using a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment 
   *   display's bounding box
   */
  public void draw7( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_ON_COLOR );
    drawSegmentB( x, y, SEGMENT_ON_COLOR );
    drawSegmentC( x, y, SEGMENT_ON_COLOR );
    drawSegmentD( x, y, SEGMENT_OFF_COLOR );
    drawSegmentE( x, y, SEGMENT_OFF_COLOR );
    drawSegmentF( x, y, SEGMENT_OFF_COLOR );
    drawSegmentG( x, y, SEGMENT_OFF_COLOR );
  }

  /**
   * Draws '8' using a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   */
  public void draw8( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_ON_COLOR );
    drawSegmentB( x, y, SEGMENT_ON_COLOR );
    drawSegmentC( x, y, SEGMENT_ON_COLOR );
    drawSegmentD( x, y, SEGMENT_ON_COLOR );
    drawSegmentE( x, y, SEGMENT_ON_COLOR );
    drawSegmentF( x, y, SEGMENT_ON_COLOR );
    drawSegmentG( x, y, SEGMENT_ON_COLOR );
  }

  /**
   * Draws '9' using a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment 
   *   display's bounding box
   */
  public void draw9( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_ON_COLOR );
    drawSegmentB( x, y, SEGMENT_ON_COLOR );
    drawSegmentC( x, y, SEGMENT_ON_COLOR );
    drawSegmentD( x, y, SEGMENT_ON_COLOR );
    drawSegmentE( x, y, SEGMENT_OFF_COLOR );
    drawSegmentF( x, y, SEGMENT_ON_COLOR );
    drawSegmentG( x, y, SEGMENT_ON_COLOR );
  }
 
  /**
   * Draws 'C' using a seven-segment display. 
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   */
  public void drawC( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_ON_COLOR );
    drawSegmentB( x, y, SEGMENT_OFF_COLOR );
    drawSegmentC( x, y, SEGMENT_OFF_COLOR );
    drawSegmentD( x, y, SEGMENT_ON_COLOR );
    drawSegmentE( x, y, SEGMENT_ON_COLOR );
    drawSegmentF( x, y, SEGMENT_ON_COLOR );
    drawSegmentG( x, y, SEGMENT_OFF_COLOR );
  }

  /**
   * Draws 'E' using a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment 
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   */
  public void drawE( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_ON_COLOR );
    drawSegmentB( x, y, SEGMENT_OFF_COLOR );
    drawSegmentC( x, y, SEGMENT_OFF_COLOR );
    drawSegmentD( x, y, SEGMENT_ON_COLOR );
    drawSegmentE( x, y, SEGMENT_ON_COLOR );
    drawSegmentF( x, y, SEGMENT_ON_COLOR );
    drawSegmentG( x, y, SEGMENT_ON_COLOR );
  }

  /**
   * Draws 'A' using a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   */
  public void drawA( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_ON_COLOR );
    drawSegmentB( x, y, SEGMENT_ON_COLOR );
    drawSegmentC( x, y, SEGMENT_ON_COLOR );
    drawSegmentD( x, y, SEGMENT_OFF_COLOR );
    drawSegmentE( x, y, SEGMENT_ON_COLOR );
    drawSegmentF( x, y, SEGMENT_ON_COLOR );
    drawSegmentG( x, y, SEGMENT_ON_COLOR );
  }

  /**
   * Draws 'N' using a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   */
  public void drawN( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_ON_COLOR );
    drawSegmentB( x, y, SEGMENT_ON_COLOR );
    drawSegmentC( x, y, SEGMENT_ON_COLOR );
    drawSegmentD( x, y, SEGMENT_OFF_COLOR );
    drawSegmentE( x, y, SEGMENT_ON_COLOR );
    drawSegmentF( x, y, SEGMENT_ON_COLOR );
    drawSegmentG( x, y, SEGMENT_OFF_COLOR );
  }

  /**
   * Draws 'D' using a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment 
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   */
  public void drawD( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_OFF_COLOR );
    drawSegmentB( x, y, SEGMENT_ON_COLOR );
    drawSegmentC( x, y, SEGMENT_ON_COLOR );
    drawSegmentD( x, y, SEGMENT_ON_COLOR );
    drawSegmentE( x, y, SEGMENT_ON_COLOR );
    drawSegmentF( x, y, SEGMENT_OFF_COLOR );
    drawSegmentG( x, y, SEGMENT_ON_COLOR );
  }

  /**
   * Draws 'I' using a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper left corner of the seven-segment
   *   display's bounding box
   */
  public void drawI( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_OFF_COLOR );
    drawSegmentB( x, y, SEGMENT_OFF_COLOR );
    drawSegmentC( x, y, SEGMENT_OFF_COLOR );
    drawSegmentD( x, y, SEGMENT_OFF_COLOR );
    drawSegmentE( x, y, SEGMENT_ON_COLOR );
    drawSegmentF( x, y, SEGMENT_ON_COLOR );
    drawSegmentG( x, y, SEGMENT_OFF_COLOR );
  }

  /**
   * Draws 'Gap' using a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment 
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   */
  public void drawGap( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_OFF_COLOR );
    drawSegmentB( x, y, SEGMENT_OFF_COLOR );
    drawSegmentC( x, y, SEGMENT_OFF_COLOR );
    drawSegmentD( x, y, SEGMENT_OFF_COLOR );
    drawSegmentE( x, y, SEGMENT_OFF_COLOR );
    drawSegmentF( x, y, SEGMENT_OFF_COLOR );
    drawSegmentG( x, y, SEGMENT_OFF_COLOR );
  }

  // New Characters for Extra Credit Begin Here

  /**
   * Draws 'P' using a sevem-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment 
   *   display's bounding box
   */
  public void drawP( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_ON_COLOR );
    drawSegmentB( x, y, SEGMENT_ON_COLOR );
    drawSegmentC( x, y, SEGMENT_OFF_COLOR );
    drawSegmentD( x, y, SEGMENT_OFF_COLOR );
    drawSegmentE( x, y, SEGMENT_ON_COLOR );
    drawSegmentF( x, y, SEGMENT_ON_COLOR );
    drawSegmentG( x, y, SEGMENT_ON_COLOR );
  }

  /**
   * Draws 'U' using a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   */
  public void drawU( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_OFF_COLOR );
    drawSegmentB( x, y, SEGMENT_ON_COLOR );
    drawSegmentC( x, y, SEGMENT_ON_COLOR );
    drawSegmentD( x, y, SEGMENT_ON_COLOR );
    drawSegmentE( x, y, SEGMENT_ON_COLOR );
    drawSegmentF( x, y, SEGMENT_ON_COLOR );
    drawSegmentG( x, y, SEGMENT_OFF_COLOR );
  }

  /**
   * Draws 'H' using a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment 
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   */
  public void drawH( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_OFF_COLOR );
    drawSegmentB( x, y, SEGMENT_ON_COLOR );
    drawSegmentC( x, y, SEGMENT_ON_COLOR );
    drawSegmentD( x, y, SEGMENT_OFF_COLOR );
    drawSegmentE( x, y, SEGMENT_ON_COLOR );
    drawSegmentF( x, y, SEGMENT_ON_COLOR );
    drawSegmentG( x, y, SEGMENT_ON_COLOR );
  }

  /**
   * Draws 'T' using a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment 
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment 
   *   display's bounding box
   */
  public void drawT( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_OFF_COLOR );
    drawSegmentB( x, y, SEGMENT_OFF_COLOR );
    drawSegmentC( x, y, SEGMENT_OFF_COLOR );
    drawSegmentD( x, y, SEGMENT_ON_COLOR );
    drawSegmentE( x, y, SEGMENT_ON_COLOR );
    drawSegmentF( x, y, SEGMENT_ON_COLOR );
    drawSegmentG( x, y, SEGMENT_ON_COLOR );
  }

  /**
   * Draws '-' using a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment 
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   */
  public void drawDash( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_OFF_COLOR );
    drawSegmentB( x, y, SEGMENT_OFF_COLOR );
    drawSegmentC( x, y, SEGMENT_OFF_COLOR );
    drawSegmentD( x, y, SEGMENT_OFF_COLOR );
    drawSegmentE( x, y, SEGMENT_OFF_COLOR );
    drawSegmentF( x, y, SEGMENT_OFF_COLOR );
    drawSegmentG( x, y, SEGMENT_ON_COLOR );
  }

  /**
   * Draws 'B' using a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   */
  public void drawB( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_OFF_COLOR );
    drawSegmentB( x, y, SEGMENT_OFF_COLOR );
    drawSegmentC( x, y, SEGMENT_ON_COLOR );
    drawSegmentD( x, y, SEGMENT_ON_COLOR );
    drawSegmentE( x, y, SEGMENT_ON_COLOR );
    drawSegmentF( x, y, SEGMENT_ON_COLOR );
    drawSegmentG( x, y, SEGMENT_ON_COLOR );
  }

  /**
   * Draws 'Y' using a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   */
  public void drawY( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_OFF_COLOR );
    drawSegmentB( x, y, SEGMENT_ON_COLOR );
    drawSegmentC( x, y, SEGMENT_ON_COLOR );
    drawSegmentD( x, y, SEGMENT_ON_COLOR );
    drawSegmentE( x, y, SEGMENT_OFF_COLOR );
    drawSegmentF( x, y, SEGMENT_ON_COLOR );
    drawSegmentG( x, y, SEGMENT_ON_COLOR );
  }

  /**
   * Draws 'L' using a seven-segment display.
   *
   * @param x the x-coordinate of the upper-left corner of the seven-segment 
   *   display's bounding box
   * @param y the y-coordinate of the upper-left corner of the seven-segment
   *   display's bounding box
   */
  public void drawL( int x, int y ) {
    drawSegmentA( x, y, SEGMENT_OFF_COLOR );
    drawSegmentB( x, y, SEGMENT_OFF_COLOR );
    drawSegmentC( x, y, SEGMENT_OFF_COLOR );
    drawSegmentD( x, y, SEGMENT_ON_COLOR );
    drawSegmentE( x, y, SEGMENT_ON_COLOR );
    drawSegmentF( x, y, SEGMENT_ON_COLOR );
    drawSegmentG( x, y, SEGMENT_OFF_COLOR ); 
  }
 
} // End class CSE11_TurtleGraphics

