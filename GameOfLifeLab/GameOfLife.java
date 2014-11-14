import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @nfguerrero
 * @version 11/7/14
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 50 rows and 100 columns
    private final int ROWS = 50;
    private final int COLS = 74;
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(this.ROWS, this.COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // constants for the location of the three cells initially alive
        //GosperGlider gun 1
        final int X1 = 0, Y1 = 4;
        final int X2 = 0, Y2 = 5;
        final int X3 = 1, Y3 = 4;
        final int X4 = 1, Y4 = 5;
        final int X5 = 10, Y5 = 4;
        final int X6 = 10, Y6 = 5;
        final int X7 = 10, Y7 = 6;
        final int X8 = 11, Y8 = 3;
        final int X9 = 12, Y9 = 2;
        final int X10 = 13, Y10 = 2; 
        final int X11 = 11, Y11 = 7;
        final int X12 = 12, Y12 = 8;
        final int X13 = 13, Y13 = 8;
        final int X14 = 14, Y14 = 5;
        final int X15 = 15, Y15 = 3;
        final int X16 = 15, Y16 = 7;
        final int X17 = 16, Y17 = 4;
        final int X18 = 16, Y18 = 5;
        final int X19 = 16, Y19 = 6;
        final int X20 = 17, Y20 = 5;
        final int X21 = 20, Y21 = 4;
        final int X22 = 20, Y22 = 3;
        final int X23 = 20, Y23 = 2;
        final int X24 = 21, Y24 = 4;
        final int X25 = 21, Y25 = 3;
        final int X26 = 21, Y26 = 2;
        final int X27 = 22, Y27 = 1;
        final int X28 = 22, Y28 = 5;
        final int X29 = 24, Y29 = 1;
        final int X30 = 24, Y30 = 0;
        final int X31 = 24, Y31 = 5;
        final int X32 = 24, Y32 = 6;
        final int X33 = 34, Y33 = 2;
        final int X34 = 34, Y34 = 3;
        final int X35 = 35, Y35 = 2;
        final int X36 = 35, Y36 = 3; 
        //GosperGlider gun 2
        final int X37 = 37, Y37 = 2;
        final int X38 = 37, Y38 = 3;
        final int X39 = 38, Y39 = 2;
        final int X40 = 38, Y40 = 3;
        final int X41 = 48, Y41 = 1;
        final int X42 = 48, Y42 = 0;
        final int X43 = 48, Y43 = 5;
        final int X44 = 48, Y44 = 6; 
        final int X45 = 50, Y45 = 1;
        final int X46 = 50, Y46 = 5;
        final int X47 = 51, Y47 = 2;
        final int X48 = 51, Y48 = 3;
        final int X49 = 51, Y49 = 4;
        final int X50 = 52, Y50 = 2;
        final int X51 = 52, Y51 = 3;
        final int X52 = 52, Y52 = 4;
        final int X53 = 55, Y53 = 5;
        final int X54 = 56, Y54 = 4;
        final int X55 = 56, Y55 = 5;
        final int X56 = 56, Y56 = 6;
        final int X57 = 57, Y57 = 3;
        final int X58 = 57, Y58 = 7;
        final int X59 = 58, Y59 = 5;
        final int X60 = 59, Y60 = 2;
        final int X61 = 60, Y61 = 2;
        final int X62 = 59, Y62 = 8;
        final int X63 = 60, Y63 = 8;
        final int X64 = 61, Y64 = 3;
        final int X65 = 61, Y65 = 7;
        final int X66 = 62, Y66 = 4;
        final int X67 = 62, Y67 = 5;
        final int X68 = 62, Y68 = 6;
        final int X69 = 71, Y69 = 4;
        final int X70 = 71, Y70 = 5;
        final int X71 = 72, Y71 = 4;
        final int X72 = 72, Y72 = 5;
        //GosperGlider gun 3
        final int X73 = 37, Y73 = 41;
        final int X74 = 38, Y74 = 41;
        final int X75 = 37, Y75 = 42; 
        final int X76 = 38, Y76 = 42;
        final int X77 = 48, Y77 = 43;
        final int X78 = 48, Y78 = 44;
        final int X79 = 48, Y79 = 39;
        final int X80 = 48, Y80 = 38;
        final int X81 = 50, Y81 = 39;
        final int X82 = 50, Y82 = 43;
        final int X83 = 51, Y83 = 40;
        final int X84 = 51, Y84 = 41;
        final int X85 = 51, Y85 = 42;
        final int X86 = 52, Y86 = 40;
        final int X87 = 52, Y87 = 41;
        final int X88 = 52, Y88 = 42;
        final int X89 = 55, Y89 = 39;
        final int X90 = 56, Y90 = 38;
        final int X91 = 56, Y91 = 39;
        final int X92 = 56, Y92 = 40;
        final int X93 = 57, Y93 = 37;
        final int X94 = 57, Y94 = 41;
        final int X95 = 58, Y95 = 39;
        final int X96 = 59, Y96 = 36;
        final int X97 = 60, Y97 = 36;
        final int X98 = 59, Y98 = 42;
        final int X99 = 60, Y99 = 42;
        final int X100 = 61, Y100 = 37;
        final int X101 = 61, Y101 = 41;
        final int X102 = 62, Y102 = 38;
        final int X103 = 62, Y103 = 39;
        final int X104 = 62, Y104 = 40;
        final int X105 = 71, Y105 = 38;
        final int X106 = 71, Y106 = 39;
        final int X107 = 72, Y107 = 38;
        final int X108 = 72, Y108 = 39;
        //GosperGlider gun 4
        final int X109 = 35, Y109 = 41;
        final int X110 = 35, Y110 = 42;
        final int X111 = 34, Y111 = 41;
        final int X112 = 34, Y112 = 42;
        final int X113 = 24, Y113 = 38;
        final int X114 = 24, Y114 = 39;
        final int X115 = 24, Y115 = 43;
        final int X116 = 24, Y116 = 44;
        final int X117 = 22, Y117 = 39;
        final int X118 = 22, Y118 = 43;
        final int X119 = 21, Y119 = 40;
        final int X120 = 21, Y120 = 41;
        final int X121 = 21, Y121 = 42;
        final int X122 = 20, Y122 = 40;
        final int X123 = 20, Y123 = 41;
        final int X124 = 20, Y124 = 42;
        final int X125 = 17, Y125 = 39;
        final int X126 = 16, Y126 = 38;
        final int X127 = 16, Y127 = 39;
        final int X128 = 16, Y128 = 40;
        final int X129 = 15, Y129 = 37;
        final int X130 = 15, Y130 = 41;
        final int X131 = 14, Y131 = 39;
        final int X132 = 13, Y132 = 36;
        final int X133 = 13, Y133 = 42;
        final int X134 = 12, Y134 = 36;
        final int X135 = 12, Y135 = 42;
        final int X136 = 11, Y136 = 37;
        final int X137 = 11, Y137 = 41;
        final int X138 = 10, Y138 = 38;
        final int X139 = 10, Y139 = 39;
        final int X140 = 10, Y140 = 40;
        final int X141 = 0, Y141 = 38;
        final int X142 = 0, Y142 = 39;
        final int X143 = 1, Y143 = 38;
        final int X144 = 1, Y144 = 39;
        
        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(Y1, X1);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(Y2, X2);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(Y3, X3);
        grid.put(loc3, rock3);
        
        Rock rock4 = new Rock();
        Location loc4 = new Location(Y4, X4);
        grid.put(loc4, rock4);
        
        Rock rock5 = new Rock();
        Location loc5 = new Location(Y5, X5);
        grid.put(loc5, rock5);
        
        Rock rock6 = new Rock();
        Location loc6 = new Location(Y6, X6);
        grid.put(loc6, rock6);
        
        Rock rock7 = new Rock();
        Location loc7 = new Location(Y7, X7);
        grid.put(loc7, rock7);
        
        Rock rock8 = new Rock();
        Location loc8 = new Location(Y8, X8);
        grid.put(loc8, rock8);
        
        Rock rock9 = new Rock();
        Location loc9 = new Location(Y9, X9);
        grid.put(loc9, rock9);
        
        Rock rock10 = new Rock();
        Location loc10 = new Location(Y10, X10);
        grid.put(loc10, rock10);
        
        Rock rock11 = new Rock();
        Location loc11 = new Location(Y11, X11);
        grid.put(loc11, rock11);
        
        Rock rock12 = new Rock();
        Location loc12 = new Location(Y12, X12);
        grid.put(loc12, rock12);
        
        Rock rock13 = new Rock();
        Location loc13 = new Location(Y13, X13);
        grid.put(loc13, rock13);
        
        Rock rock14 = new Rock();
        Location loc14 = new Location(Y14, X14);
        grid.put(loc14, rock14);
        
        Rock rock15 = new Rock();
        Location loc15 = new Location(Y15, X15);
        grid.put(loc15, rock15);
        
        Rock rock16 = new Rock();
        Location loc16 = new Location(Y16, X16);
        grid.put(loc16, rock16);
        
        Rock rock17 = new Rock();
        Location loc17 = new Location(Y17, X17);
        grid.put(loc17, rock17);
        
        Rock rock18 = new Rock();
        Location loc18 = new Location(Y18, X18);
        grid.put(loc18, rock18);
        
        Rock rock19 = new Rock();
        Location loc19 = new Location(Y19, X19);
        grid.put(loc19, rock19);
        
        Rock rock20 = new Rock();
        Location loc20 = new Location(Y20, X20);
        grid.put(loc20, rock20);
        
        Rock rock21 = new Rock();
        Location loc21 = new Location(Y21, X21);
        grid.put(loc21, rock21);
        
        Rock rock22 = new Rock();
        Location loc22 = new Location(Y22, X22);
        grid.put(loc22, rock22);
        
        Rock rock23 = new Rock();
        Location loc23 = new Location(Y23, X23);
        grid.put(loc23, rock23);
        
        Rock rock24 = new Rock();
        Location loc24 = new Location(Y24, X24);
        grid.put(loc24, rock24);
        
        Rock rock25 = new Rock();
        Location loc25 = new Location(Y25, X25);
        grid.put(loc25, rock25);
        
        Rock rock26 = new Rock();
        Location loc26 = new Location(Y26, X26);
        grid.put(loc26, rock26);
        
        Rock rock27 = new Rock();
        Location loc27 = new Location(Y27, X27);
        grid.put(loc27, rock27);
        
        Rock rock28 = new Rock();
        Location loc28 = new Location(Y28, X28);
        grid.put(loc28, rock28);
        
        Rock rock29 = new Rock();
        Location loc29 = new Location(Y29, X29);
        grid.put(loc29, rock29);
        
        Rock rock30 = new Rock();
        Location loc30 = new Location(Y30, X30);
        grid.put(loc30, rock30);
        
        Rock rock31 = new Rock();
        Location loc31 = new Location(Y31, X31);
        grid.put(loc31, rock31);
        
        Rock rock32 = new Rock();
        Location loc32 = new Location(Y32, X32);
        grid.put(loc32, rock32);
        
        Rock rock33 = new Rock();
        Location loc33 = new Location(Y33, X33);
        grid.put(loc33, rock33);
        
        Rock rock34 = new Rock();
        Location loc34 = new Location(Y34, X34);
        grid.put(loc34, rock34);
        
        Rock rock35 = new Rock();
        Location loc35 = new Location(Y35, X35);
        grid.put(loc35, rock35);
        
        Rock rock36 = new Rock();
        Location loc36 = new Location(Y36, X36);
        grid.put(loc36, rock36);
        
        Rock rock37 = new Rock();
        Location loc37 = new Location(Y37, X37);
        grid.put(loc37, rock37);
        
        Rock rock38 = new Rock();
        Location loc38 = new Location(Y38, X38);
        grid.put(loc38, rock38);
        
        Rock rock39 = new Rock();
        Location loc39 = new Location(Y39, X39);
        grid.put(loc39, rock39);
        
        Rock rock40 = new Rock();
        Location loc40 = new Location(Y40, X40);
        grid.put(loc40, rock40);
        
        Rock rock41 = new Rock();
        Location loc41 = new Location(Y41, X41);
        grid.put(loc41, rock41);
        
        Rock rock42 = new Rock();
        Location loc42 = new Location(Y42, X42);
        grid.put(loc42, rock42);
        
        Rock rock43 = new Rock();
        Location loc43 = new Location(Y43, X43);
        grid.put(loc43, rock43);
        
        Rock rock44 = new Rock();
        Location loc44 = new Location(Y44, X44);
        grid.put(loc44, rock44);
        
        Rock rock45 = new Rock();
        Location loc45 = new Location(Y45, X45);
        grid.put(loc45, rock45);
        
        Rock rock46 = new Rock();
        Location loc46 = new Location(Y46, X46);
        grid.put(loc46, rock46);
        
        Rock rock47 = new Rock();
        Location loc47 = new Location(Y47, X47);
        grid.put(loc47, rock47);
        
        Rock rock48 = new Rock();
        Location loc48 = new Location(Y48, X48);
        grid.put(loc48, rock48);
        
        Rock rock49 = new Rock();
        Location loc49 = new Location(Y49, X49);
        grid.put(loc49, rock49);
        
        Rock rock50 = new Rock();
        Location loc50 = new Location(Y50, X50);
        grid.put(loc50, rock50);
        
        Rock rock51 = new Rock();
        Location loc51 = new Location(Y51, X51);
        grid.put(loc51, rock51);
        
        Rock rock52 = new Rock();
        Location loc52 = new Location(Y52, X52);
        grid.put(loc52, rock52);
        
        Rock rock53 = new Rock();
        Location loc53 = new Location(Y53, X53);
        grid.put(loc53, rock53);
        
        Rock rock54 = new Rock();
        Location loc54 = new Location(Y54, X54);
        grid.put(loc54, rock54);
        
        Rock rock55 = new Rock();
        Location loc55 = new Location(Y55, X55);
        grid.put(loc55, rock55);
        
        Rock rock56 = new Rock();
        Location loc56 = new Location(Y56, X56);
        grid.put(loc56, rock56);
        
        Rock rock57 = new Rock();
        Location loc57 = new Location(Y57, X57);
        grid.put(loc57, rock57);
        
        Rock rock58 = new Rock();
        Location loc58 = new Location(Y58, X58);
        grid.put(loc58, rock58);
        
        Rock rock59 = new Rock();
        Location loc59 = new Location(Y59, X59);
        grid.put(loc59, rock59);
        
        Rock rock60 = new Rock();
        Location loc60 = new Location(Y60, X60);
        grid.put(loc60, rock60);
        
        Rock rock61 = new Rock();
        Location loc61 = new Location(Y61, X61);
        grid.put(loc61, rock61);
        
        Rock rock62 = new Rock();
        Location loc62 = new Location(Y62, X62);
        grid.put(loc62, rock62);
        
        Rock rock63 = new Rock();
        Location loc63 = new Location(Y63, X63);
        grid.put(loc63, rock63);
        
        Rock rock64 = new Rock();
        Location loc64 = new Location(Y64, X64);
        grid.put(loc64, rock64);
        
        Rock rock65 = new Rock();
        Location loc65 = new Location(Y65, X65);
        grid.put(loc65, rock65);
        
        Rock rock66 = new Rock();
        Location loc66 = new Location(Y66, X66);
        grid.put(loc66, rock66);
        
        Rock rock67 = new Rock();
        Location loc67 = new Location(Y67, X67);
        grid.put(loc67, rock67);
        
        Rock rock68 = new Rock();
        Location loc68 = new Location(Y68, X68);
        grid.put(loc68, rock68);
        
        Rock rock69 = new Rock();
        Location loc69 = new Location(Y69, X69);
        grid.put(loc69, rock69);
        
        Rock rock70 = new Rock();
        Location loc70 = new Location(Y70, X70);
        grid.put(loc70, rock70);
        
        Rock rock71 = new Rock();
        Location loc71 = new Location(Y71, X71);
        grid.put(loc71, rock71);
        
        Rock rock72 = new Rock();
        Location loc72 = new Location(Y72, X72);
        grid.put(loc72, rock72);
        
        Rock rock73 = new Rock();
        Location loc73 = new Location(Y73, X73);
        grid.put(loc73, rock73);
        
        Rock rock74 = new Rock();
        Location loc74 = new Location(Y74, X74);
        grid.put(loc74, rock74);
        
        Rock rock75 = new Rock();
        Location loc75 = new Location(Y75, X75);
        grid.put(loc75, rock75);
        
        Rock rock76 = new Rock();
        Location loc76 = new Location(Y76, X76);
        grid.put(loc76, rock76);
        
        Rock rock77 = new Rock();
        Location loc77 = new Location(Y77, X77);
        grid.put(loc77, rock77);
        
        Rock rock78 = new Rock();
        Location loc78 = new Location(Y78, X78);
        grid.put(loc78, rock78);
        
        Rock rock79 = new Rock();
        Location loc79 = new Location(Y79, X79);
        grid.put(loc79, rock79);
        
        Rock rock80 = new Rock();
        Location loc80 = new Location(Y80, X80);
        grid.put(loc80, rock80);
        
        Rock rock81 = new Rock();
        Location loc81 = new Location(Y81, X81);
        grid.put(loc81, rock81);
        
        Rock rock82 = new Rock();
        Location loc82 = new Location(Y82, X82);
        grid.put(loc82, rock82);
        
        Rock rock83 = new Rock();
        Location loc83 = new Location(Y83, X83);
        grid.put(loc83, rock83);
        
        Rock rock84 = new Rock();
        Location loc84 = new Location(Y84, X84);
        grid.put(loc84, rock84);
        
        Rock rock85 = new Rock();
        Location loc85 = new Location(Y85, X85);
        grid.put(loc85, rock85);
        
        Rock rock86 = new Rock();
        Location loc86 = new Location(Y86, X86);
        grid.put(loc86, rock86);
        
        Rock rock87 = new Rock();
        Location loc87 = new Location(Y87, X87);
        grid.put(loc87, rock87);
        
        Rock rock88 = new Rock();
        Location loc88 = new Location(Y88, X88);
        grid.put(loc88, rock88);
        
        Rock rock89 = new Rock();
        Location loc89 = new Location(Y89, X89);
        grid.put(loc89, rock89);
        
        Rock rock90 = new Rock();
        Location loc90 = new Location(Y90, X90);
        grid.put(loc90, rock90);
        
        Rock rock91 = new Rock();
        Location loc91 = new Location(Y91, X91);
        grid.put(loc91, rock91);
        
        Rock rock92 = new Rock();
        Location loc92 = new Location(Y92, X92);
        grid.put(loc92, rock92);
        
        Rock rock93 = new Rock();
        Location loc93 = new Location(Y93, X93);
        grid.put(loc93, rock93);
        
        Rock rock94 = new Rock();
        Location loc94 = new Location(Y94, X94);
        grid.put(loc94, rock94);
        
        Rock rock95 = new Rock();
        Location loc95 = new Location(Y95, X95);
        grid.put(loc95, rock95);
        
        Rock rock96 = new Rock();
        Location loc96 = new Location(Y96, X96);
        grid.put(loc96, rock96);
        
        Rock rock97 = new Rock();
        Location loc97 = new Location(Y97, X97);
        grid.put(loc97, rock97);
        
        Rock rock98 = new Rock();
        Location loc98 = new Location(Y98, X98);
        grid.put(loc98, rock98);
        
        Rock rock99 = new Rock();
        Location loc99 = new Location(Y99, X99);
        grid.put(loc99, rock99);
        
        Rock rock100 = new Rock();
        Location loc100 = new Location(Y100, X100);
        grid.put(loc100, rock100);
        
        Rock rock101 = new Rock();
        Location loc101 = new Location(Y101, X101);
        grid.put(loc101, rock101);
        
        Rock rock102 = new Rock();
        Location loc102 = new Location(Y102, X102);
        grid.put(loc102, rock102);
        
        Rock rock103 = new Rock();
        Location loc103 = new Location(Y103, X103);
        grid.put(loc103, rock103);
        
        Rock rock104 = new Rock();
        Location loc104 = new Location(Y104, X104);
        grid.put(loc104, rock104);
        
        Rock rock105 = new Rock();
        Location loc105 = new Location(Y105, X105);
        grid.put(loc105, rock105);
        
        Rock rock106 = new Rock();
        Location loc106 = new Location(Y106, X106);
        grid.put(loc106, rock106);
        
        Rock rock107 = new Rock();
        Location loc107 = new Location(Y107, X107);
        grid.put(loc107, rock107);
        
        Rock rock108 = new Rock();
        Location loc108 = new Location(Y108, X108);
        grid.put(loc108, rock108);
        
        Rock rock109 = new Rock();
        Location loc109 = new Location(Y109, X109);
        grid.put(loc109, rock109);
        
        Rock rock110 = new Rock();
        Location loc110 = new Location(Y110, X110);
        grid.put(loc110, rock110);
        
        Rock rock111 = new Rock();
        Location loc111 = new Location(Y111, X111);
        grid.put(loc111, rock111);
        
        Rock rock112 = new Rock();
        Location loc112 = new Location(Y112, X112);
        grid.put(loc112, rock112);
        
        Rock rock113 = new Rock();
        Location loc113 = new Location(Y113, X113);
        grid.put(loc113, rock113);
        
        Rock rock114 = new Rock();
        Location loc114 = new Location(Y114, X114);
        grid.put(loc114, rock114);
        
        Rock rock115 = new Rock();
        Location loc115 = new Location(Y115, X115);
        grid.put(loc115, rock115);
        
        Rock rock116 = new Rock();
        Location loc116 = new Location(Y116, X116);
        grid.put(loc116, rock116);
        
        Rock rock117 = new Rock();
        Location loc117 = new Location(Y117, X117);
        grid.put(loc117, rock117);
        
        Rock rock118 = new Rock();
        Location loc118 = new Location(Y118, X118);
        grid.put(loc118, rock118);
        
        Rock rock119 = new Rock();
        Location loc119 = new Location(Y119, X119);
        grid.put(loc119, rock119);
        
        Rock rock120 = new Rock();
        Location loc120 = new Location(Y120, X120);
        grid.put(loc120, rock120);
        
        Rock rock121 = new Rock();
        Location loc121 = new Location(Y121, X121);
        grid.put(loc121, rock121);
        
        Rock rock122 = new Rock();
        Location loc122 = new Location(Y122, X122);
        grid.put(loc122, rock122);
        
        Rock rock123 = new Rock();
        Location loc123 = new Location(Y123, X123);
        grid.put(loc123, rock123);
        
        Rock rock124 = new Rock();
        Location loc124 = new Location(Y124, X124);
        grid.put(loc124, rock124);
        
        Rock rock125 = new Rock();
        Location loc125 = new Location(Y125, X125);
        grid.put(loc125, rock125);
        
        Rock rock126 = new Rock();
        Location loc126 = new Location(Y126, X126);
        grid.put(loc126, rock126);
        
        Rock rock127 = new Rock();
        Location loc127 = new Location(Y127, X127);
        grid.put(loc127, rock127);
        
        Rock rock128 = new Rock();
        Location loc128 = new Location(Y128, X128);
        grid.put(loc128, rock128);
        
        Rock rock129 = new Rock();
        Location loc129 = new Location(Y129, X129);
        grid.put(loc129, rock129);
        
        Rock rock130 = new Rock();
        Location loc130 = new Location(Y130, X130);
        grid.put(loc130, rock130);
        
        Rock rock131 = new Rock();
        Location loc131 = new Location(Y131, X131);
        grid.put(loc131, rock131);
        
        Rock rock132 = new Rock();
        Location loc132 = new Location(Y132, X132);
        grid.put(loc132, rock132);
        
        Rock rock133 = new Rock();
        Location loc133 = new Location(Y133, X133);
        grid.put(loc133, rock133);
        
        Rock rock134 = new Rock();
        Location loc134 = new Location(Y134, X134);
        grid.put(loc134, rock134);
        
        Rock rock135 = new Rock();
        Location loc135 = new Location(Y135, X135);
        grid.put(loc135, rock135);
        
        Rock rock136 = new Rock();
        Location loc136 = new Location(Y136, X136);
        grid.put(loc136, rock136);
        
        Rock rock137 = new Rock();
        Location loc137 = new Location(Y137, X137);
        grid.put(loc137, rock137);
        
        Rock rock138 = new Rock();
        Location loc138 = new Location(Y138, X138);
        grid.put(loc138, rock138);
        
        Rock rock139 = new Rock();
        Location loc139 = new Location(Y139, X139);
        grid.put(loc139, rock139);
        
        Rock rock140 = new Rock();
        Location loc140 = new Location(Y140, X140);
        grid.put(loc140, rock140);
        
        Rock rock141 = new Rock();
        Location loc141 = new Location(Y141, X141);
        grid.put(loc141, rock141);
        
        Rock rock142 = new Rock();
        Location loc142 = new Location(Y142, X142);
        grid.put(loc142, rock142);
        
        Rock rock143 = new Rock();
        Location loc143 = new Location(Y143, X143);
        grid.put(loc143, rock143);
        
        Rock rock144 = new Rock();
        Location loc144 = new Location(Y144, X144);
        grid.put(loc144, rock144);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        
        // insert magic here...
        BoundedGrid<Actor> newGrid = new BoundedGrid<Actor>(this.ROWS, this.COLS);
        
        // create a world based on the grid
        world.setGrid(newGrid);
        
        for (int row = 0; row < this.ROWS - 1; row++)
        {
            for (int col = 0; col < this.COLS - 1; col++)
            {
                Location loc = new Location(row, col);
                ArrayList around = grid.getOccupiedAdjacentLocations(loc);
                if ((around.size() < 2) && (grid.get(loc) != null))
                {
                    newGrid.remove(loc);
                }
                else if ((around.size() < 4) && (grid.get(loc) != null))
                {
                    Rock rock = new Rock();
                    newGrid.put(loc, rock);
                }
                else if ((around.size() > 3) && (grid.get(loc) != null))
                {
                    newGrid.remove(loc);
                }
                else if ((around.size() == 3) && (grid.get(loc) == null))
                {
                    Rock rock = new Rock();
                    newGrid.put(loc, rock);
                }
                
                world.show();
            }
        }
        
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        GameOfLife game = new GameOfLife();        
        while (true)
        {
            Thread.sleep(100);
            game.createNextGeneration();
        }
    }

}
