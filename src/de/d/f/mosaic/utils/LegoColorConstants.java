package de.d.f.mosaic.utils;

import java.util.Arrays;
import java.util.List;

import org.opencv.core.Scalar;

import de.d.f.mosaic.color.LegoColor;

public final class LegoColorConstants {
	private LegoColorConstants() {
		//
	}

	// @formatter:off
	public static final LegoColor UNKNOWN = new LegoColor(-1, "UNKNOWN", -1, "UNKNOWN", ColorUtils.transformColorHexToScalar("000000"), false, false);

	public static final List<LegoColor> ALL_LEGO_COLORS_WITH_BL = Arrays.asList(
			new LegoColor(1,"White",1,"White",new Scalar(244,244,244), false, false),
			new LegoColor(2,"Grey",9,"Light Gray",new Scalar(141,146,138), false, false),
			new LegoColor(3,"Light Yellow",33,"Light Yellow",new Scalar(141,214,255), false, false),
			new LegoColor(4,"Brick Red",106,"Fabuland Brown",new Scalar(94,112,242), false, false),
			new LegoColor(5,"Brick Yellow",2,"Tan",new Scalar(141,185,204), false, false),
			new LegoColor(6,"Light Green",38,"Light Green",new Scalar(168,217,173), false, false),
			new LegoColor(9,"Light Reddish Violet",23,"Pink",new Scalar(187,169,246), false, false),
			new LegoColor(11,"Pastel Blue",72,"Maersk Blue",new Scalar(255,217,171), false, false),
			new LegoColor(12,"Light Orange Brown",29,"Earth Orange",new Scalar(44,109,216), false, false),
			new LegoColor(16,"Pink",94,"Medium Dark Pink",new Scalar(156,135,255), false, false),
			new LegoColor(18,"Nougat",28,"Nougat",new Scalar(90,128,187), false, false),
			new LegoColor(19,"Light Brown",160,"Fabuland Orange",new Scalar(71,138,207), false, false),
			new LegoColor(21,"Bright Red",5,"Red",new Scalar(0,0,180), false, false),
			new LegoColor(22,"Medium Reddish Violet",47,"Dark Pink",new Scalar(152,80,208), false, false),
			new LegoColor(23,"Bright Blue",7,"Blue",new Scalar(168,90,30), false, false),
			new LegoColor(24,"Bright Yellow",3,"Yellow",new Scalar(10,200,250), false, false),
			new LegoColor(25,"Earth Orange",8,"Brown",new Scalar(36,51,84), false, false),
			new LegoColor(26,"Black",11,"Black",new Scalar(0,0,0), false, false),
			new LegoColor(27,"Dark Grey",10,"Dark Gray",new Scalar(85,89,84), false, false),
			new LegoColor(28,"Dark Green",6,"Green",new Scalar(43,133,0), false, false),
			new LegoColor(29,"Medium Green",37,"Medium Green",new Scalar(117,196,127), false, false),
			new LegoColor(36,"Light Yellowish Orange",96,"Very Light Orange",new Scalar(131,195,253), false, false),
			new LegoColor(37,"Bright Green",36,"Bright Green",new Scalar(65,171,88), false, false),
			new LegoColor(38,"Dark Orange",68,"Dark Orange",new Scalar(28,80,145), false, false),
			new LegoColor(39,"Light Bluish Violet",44,"Light Violet",new Scalar(214,190,175), false, false),
			new LegoColor(45,"Light Blue",62,"Light Blue",new Scalar(217,203,151), false, false),
			new LegoColor(100,"Light Red",26,"Light Salmon",new Scalar(165,183,249), false, false),
			new LegoColor(101,"Medium Red",25,"Salmon",new Scalar(97,109,240), false, false),
			new LegoColor(102,"Medium Blue",42,"Medium Blue",new Scalar(200,150,115), false, false),
			new LegoColor(103,"Light Grey",49,"Very Light Gray",new Scalar(165,180,188), false, false),
			new LegoColor(104,"Bright Violet",24,"Purple",new Scalar(129,31,103), false, false),
			new LegoColor(105,"Bright Yellowish Orange",31,"Medium Orange",new Scalar(36,134,245), false, false),
			new LegoColor(106,"Bright Orange",4,"Orange",new Scalar(35,121,214), false, false),
			new LegoColor(107,"Bright Bluish Green",39,"Dark Turquoise",new Scalar(159,157,6), false, false),
			new LegoColor(110,"Bright Bluish Violet",43,"Violet",new Scalar(154,70,38), false, false),
			new LegoColor(112,"Medium Bluish Violet",73,"Medium Violet",new Scalar(172,97,72), false, false),
			new LegoColor(115,"Medium Yellowish Green",76,"Medium Lime",new Scalar(37,212,183), false, false),
			new LegoColor(116,"Medium Bluish Green",40,"Light Turquoise",new Scalar(164,170,0), false, false),
			new LegoColor(118,"Light Bluish Green",41,"Aqua",new Scalar(204,214,156), false, false),
			new LegoColor(119,"Bright Yellowish Green",34,"Lime",new Scalar(24,202,165), false, false),
			new LegoColor(120,"Light Yellowish Green",35,"Light Lime",new Scalar(146,234,222), false, false),
			new LegoColor(121,"Medium Yellowish Orange",32,"Light Orange",new Scalar(57,154,248), false, false),
			new LegoColor(124,"Bright Reddish Violet",71,"Magenta",new Scalar(118,31,144), false, false),
			new LegoColor(128,"Dark Nougat",225,"Dark Nougat",new Scalar(64,97,173), false, false),
			new LegoColor(133,"Neon Orange",165,"Neon Orange",new Scalar(40,88,239), false, false),
			new LegoColor(134,"Neon Green",166,"Neon Green",new Scalar(52,221,205), false, false),
			new LegoColor(135,"Sand Blue",55,"Sand Blue",new Scalar(154,129,112), false, false),
			new LegoColor(136,"Sand Violet",54,"Sand Purple",new Scalar(125,101,117), false, false),
			new LegoColor(138,"Sand Yellow",69,"Dark Tan",new Scalar(98,125,137), false, false),
			new LegoColor(140,"Earth Blue",63,"Dark Blue",new Scalar(90,50,25), false, false),
			new LegoColor(141,"Earth Green",80,"Dark Green",new Scalar(26,69,0), false, false),
			new LegoColor(151,"Sand Green",48,"Sand Green",new Scalar(124,142,112), false, false),
			new LegoColor(153,"Sand Red",58,"Sand Red",new Scalar(94,96,136), false, false),
			new LegoColor(154,"(New) Dark Red",59,"Dark Red",new Scalar(18,0,114), false, false),
			new LegoColor(180,"Curry",161,"Dark Yellow",new Scalar(46,152,221), false, false),
			new LegoColor(191,"Flame Yellowish Orange",110,"Bright Light Orange",new Scalar(0,172,252), false, false),
			new LegoColor(192,"Reddish Brown",88,"Reddish Brown",new Scalar(9,49,95), false, false),
			new LegoColor(194,"Medium Stone Grey",86,"Light Bluish Gray",new Scalar(150,150,150), false, false),
			new LegoColor(195,"Royal Blue",97,"Blue-Violet",new Scalar(167,88,28), false, false),
			new LegoColor(196,"Dark Royal Blue",109,"Dark Blue-Violet",new Scalar(154,62,14), false, false),
			new LegoColor(198,"Bright Reddish Lilac",93,"Light Purple",new Scalar(168,18,138), false, false),
			new LegoColor(199,"Dark Stone Grey",85,"Dark Bluish Gray",new Scalar(100,100,100), false, false),
			new LegoColor(208,"Light Stone Grey",99,"Very Light Bluish Gray",new Scalar(200,200,200), false, false),
			new LegoColor(212,"Light Royal Blue",105,"Bright Light Blue",new Scalar(247,195,157), false, false),
			new LegoColor(217,"Brown",91,"Medium Brown",new Scalar(65,93,123), false, false),
			new LegoColor(218,"Reddish Lilac",227,"Clikits Lavender",new Scalar(151,85,142), false, false),
			new LegoColor(219,"Lilac",73,"Medium Violet",new Scalar(157,78,86), false, false),
			new LegoColor(221,"Bright Purple",47,"Dark Pink",new Scalar(155,80,200), false, false),
			new LegoColor(222,"Light Purple",104,"Bright Pink",new Scalar(205,158,255), false, false),
			new LegoColor(226,"Cool Yellow",103,"Bright Light Yellow",new Scalar(108,236,255), false, false),
			new LegoColor(232,"Dove Blue",87,"Sky Blue",new Scalar(216,201,119), false, false),
			new LegoColor(268,"Medium Lilac",89,"Dark Purple",new Scalar(145,26,68), false, false),
			new LegoColor(283,"Light Nougat",90,"Light Nougat",new Scalar(149,201,255), false, false),
			new LegoColor(308,"Dark Brown",120,"Dark Brown",new Scalar(0,33,53), false, false),
			new LegoColor(312,"Medium Nougat",150,"Medium Nougat",new Scalar(85,125,170), false, false),
			new LegoColor(321,"Dark Azur",153,"Dark Azure",new Scalar(195,155,70), false, false),
			new LegoColor(322,"Medium Azur",156,"Medium Azure",new Scalar(226,195,104), false, false),
			new LegoColor(323,"Aqua",152,"Light Aqua",new Scalar(234,242,211), false, false),
			new LegoColor(324,"Medium Lavender",157,"Medium Lavender",new Scalar(185,110,160), false, false),
			new LegoColor(325,"Lavender",154,"Lavender",new Scalar(215,243,245), false, false),
			new LegoColor(326,"Spring Yellowish Green",158,"Yellowish Green",new Scalar(154,249,226), false, false),
			new LegoColor(330,"Olive Green",155,"Olive Green",new Scalar(79,132,139), false, false),
			new LegoColor(40,"Transparent",12,"Trans-Clear",new Scalar(238,238,238), true, false),
			new LegoColor(41,"Transparent Red",17,"Trans-Red",new Scalar(0,0,184), true, false),
			new LegoColor(42,"Transparent Light Blue",15,"Trans-Light Blue",new Scalar(237,221,173), true, false),
			new LegoColor(43,"Transparent Blue",14,"Trans-Dark Blue",new Scalar(184,133,0), true, false),
			new LegoColor(44,"Transparent Yellow",19,"Trans-Yellow",new Scalar(34,230,255), true, false),
			new LegoColor(47,"Transparent Fluorescent Reddish Orange",18,"Trans-Neon Orange",new Scalar(41,78,203), true, false),
			new LegoColor(48,"Transparent Green",20,"Trans-Green",new Scalar(100,180,115), true, false),
			new LegoColor(49,"Transparent Fluorescent Green",16,"Trans-Neon Green",new Scalar(91,241,250), true, false),
			new LegoColor(111,"Transparent Brown",13,"Trans-Black",new Scalar(158,178,187), true, false),
			new LegoColor(113,"Transparent Medium Reddish Violet",50,"Trans-Dark Pink",new Scalar(207,142,253), true, false),
			new LegoColor(126,"Transparent Bright Bluish Violet",51,"Trans-Purple",new Scalar(184,122,111), true, false),
			new LegoColor(143,"Transparent Fluorescent Blue",74,"Trans-Medium Blue",new Scalar(240,205,165), true, false),
			new LegoColor(157,"Transparent Fluorescent Yellow",121,"Trans-Neon Yellow",new Scalar(92,246,255), true, false),
			new LegoColor(158,"Transparent Fluorescent Red",50,"Trans-Dark Pink",new Scalar(187,142,241), true, false),
			new LegoColor(182,"Transparent Bright Orange",98,"Trans-Orange",new Scalar(10,141,225), true, false),
			new LegoColor(227,"Transparent Bright Yellowish Green",226,"Trans-Light Bright Green",new Scalar(136,231,201), true, false),
			new LegoColor(229,"Transparent Light Bluish Green",113,"Trans-Aqua",new Scalar(222,212,172), true, false),
			new LegoColor(230,"Transparent Bright Purple",107,"Trans-Pink",new Scalar(201,163,236), true, false),
			new LegoColor(231,"Transparent Flame Yellowish Orange",164,"Trans-Light Orange",new Scalar(109,183,252), true, false),
			new LegoColor(236,"Transparent Bright Reddish Lilac",51,"Trans-Purple",new Scalar(179,115,141), true, false),
			new LegoColor(284,"Transparent Reddish Lilac",114,"Trans-Light Purple",new Scalar(229,208,224), true, false),
			new LegoColor(285,"Transparent Light Green",221,"Trans-Light Green",new Scalar(218,214,228), true, false),
			new LegoColor(311,"Transparent Bright Green",108,"Trans-Bright Green",new Scalar(70,210,175), true, false),
			new LegoColor(127,"Gold",61,"Pearl Light Gold",new Scalar(102,172,222), false, false),
			new LegoColor(131,"Silver",66,"Pearl Light Gray",new Scalar(160,160,160), false, false),
			new LegoColor(139,"Copper",84,"Copper",new Scalar(59,77,118), false, false),
			new LegoColor(145,"Metallic Sand Blue",78,"Metal Blue",new Scalar(144,117,91), false, false),
			new LegoColor(147,"Metallic Sand Yellow",81,"Flat Dark Gold",new Scalar(79,114,131), false, false),
			new LegoColor(148,"Metallic Dark Grey",77,"Pearl Dark Gray",new Scalar(72,77,72), false, false),
			new LegoColor(150,"Metallic Light Grey",119,"Pearl Very Light Gray",new Scalar(153,155,152), false, false),
			new LegoColor(179,"Silver Flip/Flop",95,"Flat Silver",new Scalar(113,114,115), false, false),
			new LegoColor(183,"Metallic White",83,"Pearl White",new Scalar(223,242,246), false, false),
			new LegoColor(200,"Lemon Metallic",70,"Metallic Green",new Scalar(68,121,106), false, false),
			new LegoColor(296,"Cool Silver",66,"Pearl Light Gray",new Scalar(173,173,173), false, false),
			new LegoColor(297,"Warm Gold",115,"Pearl Gold",new Scalar(59,149,185), false, false),
			new LegoColor(315,"Silver Metallic",95,"Flat Silver",new Scalar(140,140,140), false, false),
			new LegoColor(316,"Titanium Metallic",77,"Pearl Dark Gray",new Scalar(57,60,62), false, false),
			new LegoColor(309,"Metalized Silver",22,"Chrome Silver",new Scalar(206,206,206), false, false),
			new LegoColor(310,"Metalized Gold",21,"Chrome Gold",new Scalar(118,193,223), false, false),
			new LegoColor(298,"Cool Silver, Drum Lacquered",67,"Metallic Silver",new Scalar(118,118,118), false, false),
			new LegoColor(20,"Nature",60,"Milky White",new Scalar(223,223,223), false, false),
			new LegoColor(50,"Phosphorescent White",46,"Glow In Dark Opaque",new Scalar(211,223,229), false, true),
			new LegoColor(294,"Phosphorescent Green",118,"Glow In Dark Trans",new Scalar(138,220,213), false, true),
			new LegoColor(329,"White Glow",159,"Glow In Dark White",new Scalar(215,243,245), false, true),
			new LegoColor(114,"Transparent Pink Glitter / Transparent Medium Reddish Violet Glitter",100,"Glitter Trans-Dark Pink",new Scalar(254,0,254), true, false),
			new LegoColor(117,"Transparent with Glitter",101,"Glitter Trans-Clear",new Scalar(247,247,247), true, false),
			new LegoColor(129,"Transparent Bluish Violet (Glitter)",102,"Glitter Trans-Purple",new Scalar(147,84,67), true, false)
		);



	// 1x1 stud
//	public static final LegoColor AQUA = new LegoColor("Aqua", ColorUtils.transformColorHexToScalar("B5D3D6"), false, false);
//	public static final LegoColor BLACK = new LegoColor("Black", ColorUtils.transformColorHexToScalar("212121"), false, false);
//	public static final LegoColor BLUE = new LegoColor("Blue", ColorUtils.transformColorHexToScalar("0057A6"), false, false);
//	public static final LegoColor BRIGHT_GREEN = new LegoColor("Bright Green", ColorUtils.transformColorHexToScalar("10CB31"), false, false);
//	public static final LegoColor BRIGHT_LIGHT_BLUE = new LegoColor("Bright Light Blue", ColorUtils.transformColorHexToScalar("9FC3E9"), false, false);
//	public static final LegoColor BRIGHT_LIGHT_ORANGE = new LegoColor("Bright Light Orange", ColorUtils.transformColorHexToScalar("F7BA30"), false, false);
//	public static final LegoColor BRIGHT_LIGHT_YELLOW = new LegoColor("Bright Light Yellow", ColorUtils.transformColorHexToScalar("F3E055"), false, false);
//	public static final LegoColor BRIGHT_PINK = new LegoColor("Bright Pink", ColorUtils.transformColorHexToScalar("FFBBFF"), false, false);
//	public static final LegoColor BROWN = new LegoColor("Brown", ColorUtils.transformColorHexToScalar("532115"), false, false);
//	public static final LegoColor CORAL = new LegoColor("Coral", ColorUtils.transformColorHexToScalar("F88379"), false, false);
//	public static final LegoColor DARK_AZURE = new LegoColor("Dark Azure", ColorUtils.transformColorHexToScalar("3399FF"), false, false);
//	public static final LegoColor DARK_BLUE = new LegoColor("Dark Blue", ColorUtils.transformColorHexToScalar("143044"), false, false);
//	public static final LegoColor DARK_BLUISH_GRAY = new LegoColor("Dark Bluish Gray", ColorUtils.transformColorHexToScalar("595D60"), false, false);
//	public static final LegoColor DARK_BROWN = new LegoColor("Dark Brown", ColorUtils.transformColorHexToScalar("330000"), false, false);
//	public static final LegoColor DARK_GRAY = new LegoColor("Dark Gray", ColorUtils.transformColorHexToScalar("6B5A5A"), false, false);
//	public static final LegoColor DARK_GREEN = new LegoColor("Dark Green", ColorUtils.transformColorHexToScalar("2E5543"), false, false);
//	public static final LegoColor DARK_NOUGAT = new LegoColor("Dark Nougat", ColorUtils.transformColorHexToScalar("E78B3E"), false, false);
//	public static final LegoColor DARK_ORANGE = new LegoColor("Dark Orange", ColorUtils.transformColorHexToScalar("B35408"), false, false);
//	public static final LegoColor DARK_PINK = new LegoColor("Dark Pink", ColorUtils.transformColorHexToScalar("C87080"), false, false);
//	public static final LegoColor DARK_PURPLE = new LegoColor("Dark Purple", ColorUtils.transformColorHexToScalar("5F2683"), false, false);
//	public static final LegoColor DARK_RED = new LegoColor("Dark Red", ColorUtils.transformColorHexToScalar("6A0E15"), false, false);
//	public static final LegoColor DARK_TAN = new LegoColor("Dark Tan", ColorUtils.transformColorHexToScalar("907450"), false, false);
//	public static final LegoColor DARK_TURQUOISE = new LegoColor("Dark Turquoise", ColorUtils.transformColorHexToScalar("008A80"), false, false);
//	public static final LegoColor GREEN = new LegoColor("Green", ColorUtils.transformColorHexToScalar("00642E"), false, false);
//	public static final LegoColor LAVENDER = new LegoColor("Lavender", ColorUtils.transformColorHexToScalar("B18CBF"), false, false);
//	public static final LegoColor LIGHT_AQUA = new LegoColor("Light Aqua", ColorUtils.transformColorHexToScalar("CCFFFF"), false, false);
//	public static final LegoColor LIGHT_BLUE = new LegoColor("Light Blue", ColorUtils.transformColorHexToScalar("B4D2E3"), false, false);
//	public static final LegoColor LIGHT_BLUISH_GRAY = new LegoColor("Light Bluish Gray", ColorUtils.transformColorHexToScalar("AFB5C7"), false, false);
//	public static final LegoColor LIGHT_GRAY = new LegoColor("Light Gray", ColorUtils.transformColorHexToScalar("9C9C9C"), false, false);
//	public static final LegoColor LIGHT_GREEN = new LegoColor("Light Green", ColorUtils.transformColorHexToScalar("A5DBB5"), false, false);
//	public static final LegoColor LIGHT_NOUGAT = new LegoColor("Light Nougat", ColorUtils.transformColorHexToScalar("FECCB0"), false, false);
//	public static final LegoColor LIGHT_ORANGE = new LegoColor("Light Orange", ColorUtils.transformColorHexToScalar("F7AD63"), false, false);
//	public static final LegoColor LIGHT_PINK = new LegoColor("Light Pink", ColorUtils.transformColorHexToScalar("FFE1FF"), false, false);
//	public static final LegoColor LIGHT_PURPLE = new LegoColor("Light Purple", ColorUtils.transformColorHexToScalar("DA70D6"), false, false);
//	public static final LegoColor LIGHT_TURQUOISE = new LegoColor("Light Turquoise", ColorUtils.transformColorHexToScalar("31B5CA"), false, false);
//	public static final LegoColor LIGHT_VIOLET = new LegoColor("Light Violet", ColorUtils.transformColorHexToScalar("C9CAE2"), false, false);
//	public static final LegoColor LIGHT_YELLOW = new LegoColor("Light Yellow", ColorUtils.transformColorHexToScalar("FFE383"), false, false);
//	public static final LegoColor LIME = new LegoColor("Lime", ColorUtils.transformColorHexToScalar("A6CA55"), false, false);
//	public static final LegoColor MAERSK_BLUE = new LegoColor("Maersk Blue", ColorUtils.transformColorHexToScalar("6BADD6"), false, false);
//	public static final LegoColor MAGENTA = new LegoColor("Magenta", ColorUtils.transformColorHexToScalar("B52952"), false, false);
//	public static final LegoColor MEDIUM_AZURE = new LegoColor("Medium Azure", ColorUtils.transformColorHexToScalar("42C0FB"), false, false);
//	public static final LegoColor MEDIUM_BLUE = new LegoColor("Medium Blue", ColorUtils.transformColorHexToScalar("61AFFF"), false, false);
//	public static final LegoColor MEDIUM_DARK_PINK = new LegoColor("Medium Dark Pink", ColorUtils.transformColorHexToScalar("F785B1"), false, false);
//	public static final LegoColor MEDIUM_GREEN = new LegoColor("Medium Green", ColorUtils.transformColorHexToScalar("62F58E"), false, false);
//	public static final LegoColor MEDIUM_LAVENDER = new LegoColor("Medium Lavender", ColorUtils.transformColorHexToScalar("885E9E"), false, false);
//	public static final LegoColor MEDIUM_NOUGAT = new LegoColor("Medium Nougat", ColorUtils.transformColorHexToScalar("E3A05B"), false, false);
//	public static final LegoColor MEDIUM_ORANGE = new LegoColor("Medium Orange", ColorUtils.transformColorHexToScalar("FFA531"), false, false);
//	public static final LegoColor NOUGAT = new LegoColor("Nougat", ColorUtils.transformColorHexToScalar("FFAF7D"), false, false);
//	public static final LegoColor OLIVE_GREEN = new LegoColor("Olive Green", ColorUtils.transformColorHexToScalar("7C9051"), false, false);
//	public static final LegoColor ORANGE = new LegoColor("Orange", ColorUtils.transformColorHexToScalar("FF7E14"), false, false);
//	public static final LegoColor PINK = new LegoColor("Pink", ColorUtils.transformColorHexToScalar("FFC0CB"), false, false);
//	public static final LegoColor PURPLE = new LegoColor("Purple", ColorUtils.transformColorHexToScalar("A5499C"), false, false);
//	public static final LegoColor RED = new LegoColor("Red", ColorUtils.transformColorHexToScalar("B30006"), false, false);
//	public static final LegoColor REDDISH_BROWN = new LegoColor("Reddish Brown", ColorUtils.transformColorHexToScalar("89351D"), false, false);
//	public static final LegoColor SAND_BLUE = new LegoColor("Sand Blue", ColorUtils.transformColorHexToScalar("5A7184"), false, false);
//	public static final LegoColor SAND_GREEN = new LegoColor("Sand Green", ColorUtils.transformColorHexToScalar("76A290"), false, false);
//	public static final LegoColor TAN = new LegoColor("Tan", ColorUtils.transformColorHexToScalar("DEC69C"), false, false);
//	public static final LegoColor WHITE = new LegoColor("White", ColorUtils.transformColorHexToScalar("FFFFFF"), false, false);
//	public static final LegoColor YELLOW = new LegoColor("Yellow", ColorUtils.transformColorHexToScalar("F7D117"), false, false);
//	public static final LegoColor YELLOWISH_GREEN = new LegoColor("Yellowish Green", ColorUtils.transformColorHexToScalar("DFEEA5"), false, false);
//	public static final LegoColor TRANS_BLACK = new LegoColor("Trans-Black", ColorUtils.transformColorHexToScalar("939484"), true, false);
//	public static final LegoColor TRANS_CLEAR = new LegoColor("Trans-Clear", ColorUtils.transformColorHexToScalar("EEEEEE"), true, false);
//	public static final LegoColor TRANS_DARK_BLUE = new LegoColor("Trans-Dark Blue", ColorUtils.transformColorHexToScalar("00296B"), true, false);
//	public static final LegoColor TRANS_DARK_PINK = new LegoColor("Trans-Dark Pink", ColorUtils.transformColorHexToScalar("CE1D9B"), true, false);
//	public static final LegoColor TRANS_GREEN = new LegoColor("Trans-Green", ColorUtils.transformColorHexToScalar("217625"), true, false);
//	public static final LegoColor TRANS_LIGHT_BLUE = new LegoColor("Trans-Light Blue", ColorUtils.transformColorHexToScalar("68BCC5"), true, false);
//	public static final LegoColor TRANS_LIGHT_ORANGE = new LegoColor("Trans-Light Orange", ColorUtils.transformColorHexToScalar("E99A3A"), true, false);
//	public static final LegoColor TRANS_MEDIUM_BLUE = new LegoColor("Trans-Medium Blue", ColorUtils.transformColorHexToScalar("7384A5"), true, false);
//	public static final LegoColor TRANS_NEON_ORANGE = new LegoColor("Trans-Neon Orange", ColorUtils.transformColorHexToScalar("FF4231"), true, false);
//	public static final LegoColor TRANS_ORANGE = new LegoColor("Trans-Orange", ColorUtils.transformColorHexToScalar("D04010"), true, false);
//	public static final LegoColor TRANS_PINK = new LegoColor("Trans-Pink", ColorUtils.transformColorHexToScalar("FF8298"), true, false);
//	public static final LegoColor TRANS_PURPLE = new LegoColor("Trans-Purple", ColorUtils.transformColorHexToScalar("8320B7"), true, false);
//	public static final LegoColor TRANS_RED = new LegoColor("Trans-Red", ColorUtils.transformColorHexToScalar("9C0010"), true, false);
//	public static final LegoColor TRANS_YELLOW = new LegoColor("Trans-Yellow", ColorUtils.transformColorHexToScalar("EBF72D"), true, false);
//	public static final LegoColor METAL_BLUE = new LegoColor("Metal Blue", ColorUtils.transformColorHexToScalar("5686AE"), false, false);
//	public static final LegoColor PEARL_DARK_GRAY = new LegoColor("Pearl Dark Gray", ColorUtils.transformColorHexToScalar("666660"), false, false);
//	public static final LegoColor PEARL_LIGHT_GRAY = new LegoColor("Pearl Light Gray", ColorUtils.transformColorHexToScalar("ACB7C0"), false, false);
//	public static final LegoColor GLITTER_TRANS_DARK_PINK = new LegoColor("Glitter Trans-Dark Pink", ColorUtils.transformColorHexToScalar("CE1D9B"), false, false);
//	public static final LegoColor GLITTER_TRANS_PURPLE = new LegoColor("Glitter Trans-Purple", ColorUtils.transformColorHexToScalar("3A2B82"), false, false);
	// @formatter:on

}
