# FallOfFritjof_KNS

This project is a text-based adventure game with the premise that the player (a knight) is on a mission to rescue their princess who has been captured by an agent of chaos named Fritjof (means ‘the thief of peace’). The map of the game will be a three-by-three grid of ‘Rooms’, where the character will begin in the middle of the map. In each corner of the grid, there will be an interactive room. In the top left, there will be the castle with a dungeon where the princess is being held behind a door with two locks. In the top right, there will be a chest with two items inside of it, where the character will have the option to take one or the other. In the bottom left, there will be a cave with a dragon in it that is protecting a key necessary to free the princess. The character will need to use one of the items from the chest to defeat the dragon and obtain this key. In the bottom right, there will be a shack with an imp inside who insists that you solve his riddle to give the character his key.

Game Map: 

Castle                Chest 
        Spawn Point 
Cave                  Shack

The user will be asked to name their character at the beginning of the game, and be allowed to travel in all linear directions, north, east, south, and west, if it is possible to go that way and stay inside the map. The program will process the user’s input (‘n’, ‘e’, ‘w’, or ‘s’) and determine which direction to move. Once the character has moved, the program will assess whether the character is in an interactive room and if so, provide gameplay based on whether the character has visited the room or not. In the chest room, the user will be asked to choose to take either a flute or a sword from the chest, then the chest will be closed forever. In the cave, if the user does not have either the sword or the flute, they will hear the dragon and flee, not being allowed to enter the room. If they have the flute, they will play it to lull the dragon to sleep and obtain the key, and if they have the sword, they will be able to slay the dragon and obtain the key. In the shack room, the user will be asked to solve the riddle, “I have cities, but no houses. I have mountains, but no trees. I have water, but no fish. What am I?” The correct answer is ‘a map’, and once the user answers correctly they will be given a key from the imp. For the castle, the princess will inform the character of the situation and state that there are two keys needed to free her. If the user has obtained both keys, the princess will be freed, and the game will end. The goal of the game is to collect both keys and free the princess, and dialogue changes depending on if the character has visited the room previously. The program will be structured using a total of five classes: Room, PlayableCharacter, Board, Game, and Application. The PlayableCharacter class will represent the character that moves around through the map and contain boolean values for whether they have the keys, any items, and coordinates for their location. The Room class will have a string name, and a boolean value for whether the room has been visited before. The Board class has a three-by-three array of rooms and will initialize each room in its constructor. The Game class will contain a Board and PlayableCharacter object and will have all of the gameplay methods such as movement and dialogue contained in it. The Application class will initialize a Game object and run its functions inside of a loop until the game is has been completed.

The goal for this project is to create a text-based adventure game that allows the user to explore a small world, with an emphasis on accurately processing text input. It will emphasize the use of a Scanner throughout the project and listen for different keywords based on different events and locations in order to provide a smooth gameplay experience. The classes that have been implemented will be interconnected allow for a relatively streamlined program design. After completion of the project, anybody with an understanding of the concept of a text-based game should be able to complete and enjoy the game.
