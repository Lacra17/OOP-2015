package com.gellert.zoowsome.services.factories;

public final class Constants {
	public static final class Species {
		public static final String Mammals = "Mammals";
		public static final String Reptiles = "Reptiles";
		public static final String Birds = "Birds";
		public static final String Aquatics = "Aquatics";
		public static final String Insects = "Insects";
	}

	public static final class Animals {
		public static final class Mammals {
			public static final String Cow = "COW";
			public static final String Tiger = "TIGER";
			public static final String Wolf = "WOLF";
		}

		public static final class Reptiles {
			public static final String Lizard = "LIZARD";
			public static final String Turtle = "TURTLE";
			public static final String Crocodile = "CROCODILE";
		}

		public static final class Birds {
			public static final String Pigeon = "PIGEON";
			public static final String Eagle = "EAGLE";
			public static final String Mockingjay = "MOCKINGJAY";
		}

		public static final class Aquatics {
			public static final String Dolphin = "DOLPHIN";
			public static final String Sardine = "SARDINE";
			public static final String Piranha = "PIRANHA";
		}

		public static final class Insects {
			public static final String Butterfly = "BUTTERFLY";
			public static final String Cockroach = "COCKROACH";
			public static final String Scarabeus = "SCARABEUS";
		}
	}

	public static final class Employees {
		public static final String Caretaker = "CARETAKER";

		public static final class Caretakers {
			public static final String TCO_SUCCESS = "SUCCESS";
			public static final String TCO_KILLED = "KILLED";
			public static final String TCO_NO_TIME = "NO_TIME";
		}
	}
	
	public static final class XML_TAGS {
		public static final String ANIMAL = "ANIMAL";
		public static final String DISCRIMINANT = "DISCRIMINANT";
		public static final String EMPLOYEE = "EMPLOYEE";
	}
	
	public static final class Frames {
		public static final int HEIGHT = 400;
		public static final int WIDTH = 500;
	}
	
	public static final class Arrays {
		public static final String[] Species = {"Aquatics", "Birds", "Insects", "Mammals", "Reptiles"};
		public static final String[] Mammals = {"cow", "tiger", "wolf"};
		public static final String[] Reptiles = {"lizard", "turtle", "crocodile"};
		public static final String[] Birds = {"pigeon", "eagle", "mockingjay"};
		public static final String[] Aquatics = {"dolphin", "sardine", "piranha"};
		public static final String[] Insects = {"butterfly", "cockroach", "scarabeus"};
	}
}