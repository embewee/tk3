// Generated from src/tk3/labyrinth/map/grammar/MapGrammar.g4 by ANTLR 4.0

    package tk3.labyrinth.map.grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

public interface MapGrammarListener extends ParseTreeListener {
	void enterDoors(MapGrammarParser.DoorsContext ctx);
	void exitDoors(MapGrammarParser.DoorsContext ctx);

	void enterDoor(MapGrammarParser.DoorContext ctx);
	void exitDoor(MapGrammarParser.DoorContext ctx);

	void enterButtons(MapGrammarParser.ButtonsContext ctx);
	void exitButtons(MapGrammarParser.ButtonsContext ctx);

	void enterList(MapGrammarParser.ListContext ctx);
	void exitList(MapGrammarParser.ListContext ctx);

	void enterType(MapGrammarParser.TypeContext ctx);
	void exitType(MapGrammarParser.TypeContext ctx);

	void enterDoor_goal(MapGrammarParser.Door_goalContext ctx);
	void exitDoor_goal(MapGrammarParser.Door_goalContext ctx);

	void enterId(MapGrammarParser.IdContext ctx);
	void exitId(MapGrammarParser.IdContext ctx);

	void enterField(MapGrammarParser.FieldContext ctx);
	void exitField(MapGrammarParser.FieldContext ctx);

	void enterActivate(MapGrammarParser.ActivateContext ctx);
	void exitActivate(MapGrammarParser.ActivateContext ctx);

	void enterMax_player(MapGrammarParser.Max_playerContext ctx);
	void exitMax_player(MapGrammarParser.Max_playerContext ctx);

	void enterFinish(MapGrammarParser.FinishContext ctx);
	void exitFinish(MapGrammarParser.FinishContext ctx);

	void enterStart(MapGrammarParser.StartContext ctx);
	void exitStart(MapGrammarParser.StartContext ctx);

	void enterButton(MapGrammarParser.ButtonContext ctx);
	void exitButton(MapGrammarParser.ButtonContext ctx);

	void enterRoom_attr(MapGrammarParser.Room_attrContext ctx);
	void exitRoom_attr(MapGrammarParser.Room_attrContext ctx);

	void enterName(MapGrammarParser.NameContext ctx);
	void exitName(MapGrammarParser.NameContext ctx);

	void enterRoom(MapGrammarParser.RoomContext ctx);
	void exitRoom(MapGrammarParser.RoomContext ctx);
}