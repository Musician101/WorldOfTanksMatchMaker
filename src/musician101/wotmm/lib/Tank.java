package musician101.wotmm.lib;


public enum Tank
{
	/** China Lights */
	CL_RENAULT(Constants.CHINA, Constants.LIGHT, 1, "Renault NC-31"),
	CL_VICKERS_MK_E_TYPE_B(Constants.CHINA, Constants.LIGHT, 2, "Vickers Mk. E Type B"),
	CL_CHI_HA(Constants.CHINA, Constants.LIGHT, 3, "Type 2597 Chi-Ha"),
	CL_M5A1_STUART(Constants.CHINA, Constants.LIGHT, 4, "M5A1 Stuart"),
	CL_TYPE_64(Constants.CHINA, Constants.LIGHT, 6, "Type 64", true),
	CL_59_16(Constants.CHINA, Constants.LIGHT, 6, "59-16"),
	CL_WZ_131(Constants.CHINA, Constants.LIGHT, 7, "WZ-131"),
	CL_TYPE_62(Constants.CHINA, Constants.LIGHT, 7, "Type 62", true),
	CL_WZ_132(Constants.CHINA, Constants.LIGHT, 8, "WZ-132"),
	/** China Mediums */
	CM_TYPE_T_34(Constants.CHINA, Constants.MEDIUM, 5, "Type T-34"),
	CM_TYPE_58(Constants.CHINA, Constants.MEDIUM, 6, "Type 58"),
	CM_T_34_1(Constants.CHINA, Constants.MEDIUM, 7, "T-34-1"),
	CM_T_34_2(Constants.CHINA, Constants.MEDIUM, 8, "T-34-2"),
	CM_T_34_3(Constants.CHINA, Constants.MEDIUM, 8, "T-34-3", "8-9", true),
	CM_TYPE_59(Constants.CHINA, Constants.MEDIUM, 8, "Type 59", "8-9", true),
	CM_TYPE_59_G(Constants.CHINA, Constants.MEDIUM, 8, "Type 59 G", true),
	CM_WZ_120(Constants.CHINA, Constants.MEDIUM, 9, "WZ-120"),
	CM_121(Constants.CHINA, Constants.MEDIUM, 10, "121"),
	/** China Heavys */
	CH_IS_2(Constants.CHINA, Constants.HEAVY, 7, "IS-2"),
	CH_110(Constants.CHINA, Constants.HEAVY, 8, "110"),
	CH_112(Constants.CHINA, Constants.HEAVY, 8, "112"),
	CH_WZ_111(Constants.CHINA, Constants.HEAVY, 9, "WZ-111 model 1-4"),
	CH_113(Constants.CHINA, Constants.HEAVY, 10, "113"),
	/** French Lights */
	FL_RENAULT_FT(Constants.FRANCE, Constants.LIGHT, 1, "Renault FT"),
	FL_D1(Constants.FRANCE, Constants.LIGHT, 2, "D1"),
	FL_HOTCHKISS(Constants.FRANCE, Constants.LIGHT, 2, "Hotchkiss H35"),
	FL_AMX_38(Constants.FRANCE, Constants.LIGHT, 3, "AMX 38"),
	FL_AMX_40(Constants.FRANCE, Constants.LIGHT, 4, "AMX 40", "4-6"),
	FL_ELC(Constants.FRANCE, Constants.LIGHT, 5, "ELC AMX"),
	FL_AMX_12(Constants.FRANCE, Constants.LIGHT, 6, "AMX 12 t"),
	FL_AMX_13_75(Constants.FRANCE, Constants.LIGHT, 7, "AMX 13 75"),
	FL_AMX_13_90(Constants.FRANCE, Constants.LIGHT, 8, "AMX 13 90"),
	/** French Mediums */
	FM_D2(Constants.FRANCE, Constants.MEDIUM, 3, "D2"),
	FM_LORRAINE_40(Constants.FRANCE, Constants.MEDIUM, 9, "Lorraine 40 t"),
	FM_BAT_25(Constants.FRANCE, Constants.MEDIUM, 10, "Bat.-Chatillon 25 t"),
	/** French Heavies */
	FH_B1(Constants.FRANCE, Constants.HEAVY, 4, "B1"),
	FH_BDR(Constants.FRANCE, Constants.HEAVY, 5, "BDR G1 B"),
	FH_ARL_44(Constants.FRANCE, Constants.HEAVY, 6, "ARL 44"),
	FH_AMX_M4(Constants.FRANCE, Constants.HEAVY, 7, "AMX M4 mle. 45"),
	FH_AMX_50_100(Constants.FRANCE, Constants.HEAVY, 8, "AMX 50 100"),
	FH_FCM_50(Constants.FRANCE, Constants.HEAVY, 8, "FCM 50 t", true),
	FH_AMX_50_120(Constants.FRANCE, Constants.HEAVY, 9, "AMX 50 120"),
	FH_AMX_50_B(Constants.FRANCE, Constants.HEAVY, 10, "AMX 50 B"),
	/** French TDs */
	FT_RENAULT_FT_AC(Constants.FRANCE, Constants.TD, 2, "Renault FT AC"),
	FT_RENAULT_UE(Constants.FRANCE, Constants.TD, 3, "Renault UE 57"),
	FT_FCM_PAK(Constants.FRANCE, Constants.TD, 3, "FCM36 PaK40"),
	FT_SOMUA(Constants.FRANCE, Constants.TD, 4, "Somua SAu 40"),
	FT_S_35(Constants.FRANCE, Constants.TD, 5, "S 35 CA"),
	FT_ARL_V39(Constants.FRANCE, Constants.TD, 6, "ARL V39"),
	FT_AMX_1946(Constants.FRANCE, Constants.TD, 7, "AMX AC Mle. 1946"),
	FT_AMX_1948(Constants.FRANCE, Constants.TD, 8, "AMX AC Mle. 1948"),
	FT_AMX_50_FOCH(Constants.FRANCE, Constants.TD, 9, "AMX 50 Foch"),
	FT_AMX_50_Foch_155(Constants.FRANCE, Constants.TD, 10, "AMX 50 Foch (155)"),
	/** French SPGs */
	FT_RENAULT_FT_BS(Constants.FRANCE, Constants.SPG, 2, "Renault FT BS"),
	FT_LORRAINE_39(Constants.FRANCE, Constants.SPG, 3, "Lorraine39 L AM"),
	FT_AMX_105(Constants.FRANCE, Constants.SPG, 4, "AMX 105 AM mle. 47"),
	FT_AMX_13_105(Constants.FRANCE, Constants.SPG, 5, "AMX 13 105 AM mle. 50"),
	FT_105(Constants.FRANCE, Constants.SPG, 5, "105 leFH18B2"),
	FT_AMX_13_F3(Constants.FRANCE, Constants.SPG, 6, "AMX 13 F3 AM"),
	FT_LORRAINE_155_50(Constants.FRANCE, Constants.SPG, 7, "Lorraine 155 mle. 50"),
	FT_LORRAINE_155_51(Constants.FRANCE, Constants.SPG, 8, "Lorraine 155 mle. 51"),
	FT_BAT_155_55(Constants.FRANCE, Constants.SPG, 9, "Bat.-Chatillon 155 55"),
	FT_BAT_155_58(Constants.FRANCE, Constants.SPG, 10, "Bat.-Chatillon 155 58"),
	/** German Lights */
	GL_LTRAKTOR(Constants.GERMANY, Constants.LIGHT, 1, "Leichttraktor"),
	GL_PZ_1(Constants.GERMANY, Constants.LIGHT, 2, "Pz.Kpfw. I", "2"),
	GL_PZ_2(Constants.GERMANY, Constants.LIGHT, 2, "Pz.KPfw. II"),
	GL_PZ_35(Constants.GERMANY, Constants.LIGHT, 2, "Pz.Kpfw. 35 (t)"),
	GL_PZ_38H(Constants.GERMANY, Constants.LIGHT, 2, "Pz.Kpfw. 38H 735 (f)", true),
	GL_PZ_1_C(Constants.GERMANY, Constants.LIGHT, 3, "Pz.Kpfw. I Ausf. C"),
	GL_PZ_2_G(Constants.GERMANY, Constants.LIGHT, 3, "Pz.Kpfw. II Ausf. G"),
	GL_PZ_3_A(Constants.GERMANY, Constants.LIGHT, 3, "Pz.Kpfw. III Ausf. A"),
	GL_PZ_38_T(Constants.GERMANY, Constants.LIGHT, 3, "Pz.Kpfw. 38 (t)"),
	GL_T_15(Constants.GERMANY, Constants.LIGHT, 3, "T-15", true),
	GL_PZ_2_J(Constants.GERMANY, Constants.LIGHT, 3, "Pz.Kpfw. II Ausf. J", "3-4", true),
	GL_PZ_2_LUCHS(Constants.GERMANY, Constants.LIGHT, 4, "Pz.Kpfw. II Luchs"),
	GL_PZ_38_T_NA(Constants.GERMANY, Constants.LIGHT, 4, "Pz.Kpfw. 38 (t) n.A."),
	GL_VK_1602(Constants.GERMANY, Constants.LIGHT, 5, "VK 16.02 Leopard"),
	GL_VK_2801(Constants.GERMANY, Constants.LIGHT, 6, "VK 28.01"),
	GL_AUFK_PANTHER(Constants.GERMANY, Constants.LIGHT, 7, "Auflarungspanzer Panther"),
	/** German Mediums */
	GM_PZ_S35(Constants.GERMANY, Constants.MEDIUM, 3, "Pz.Kpfw. S25 739 (f)", true),
	GM_VK_2001(Constants.GERMANY, Constants.MEDIUM, 4, "VK 20.01 (D)"),
	GM_PZ_3(Constants.GERMANY, Constants.MEDIUM, 4, "Pz.Kpfw. III"),
	GM_PZ_3_4(Constants.GERMANY, Constants.MEDIUM, 5, "Pz.Kpfw. III/IV"),
	GM_PZ_4(Constants.GERMANY, Constants.MEDIUM, 5, "Pz.Kpfw. IV"),
	GM_T_25(Constants.GERMANY, Constants.MEDIUM, 5, "T-25", true),
	GM_PZ_4_HYRDO(Constants.GERMANY, Constants.MEDIUM, 5, "Pz.Kpfw. IV Hydraulic", "5-6", true),
	GM_VK_3001_D(Constants.GERMANY, Constants.MEDIUM, 6, "VK 30.01 (D)"),
	GM_VK_3001_P(Constants.GERMANY, Constants.MEDIUM, 6, "VK 30.01 (P)"),
	GM_VK_3002_M(Constants.GERMANY, Constants.MEDIUM, 6, "VK 30.02 (M)"),
	GM_PZ_IV_SCHM(Constants.GERMANY, Constants.MEDIUM, 6, "Pz.Kpfw. IV Schmalturm", true),
	GM_PZ_5_4(Constants.GERMANY, Constants.MEDIUM, 6, "Pz.Kpfw. V/IV", true),
	GM_PZ_5_4_A(Constants.GERMANY, Constants.MEDIUM, 6, "Pz.Kpfw. V/IV Alpha", true),
	GM_VK_3002_D(Constants.GERMANY, Constants.MEDIUM, 7, "VK 30.02 (D)"),
	GM_PZ_5(Constants.GERMANY, Constants.MEDIUM, 7, "Pz.Kpfw. V Panther"),
	GM_Panther_M10(Constants.GERMANY, Constants.MEDIUM, 7, "Panther/M10", "7-8", true),
	GM_INDIEN(Constants.GERMANY, Constants.MEDIUM, 8, "Indien-Panzer"),
	GM_PANTHER_2(Constants.GERMANY, Constants.MEDIUM, 8, "Panther II"),
	GM_LEOPARD_PROTO(Constants.GERMANY, Constants.MEDIUM, 9, "Leopard prototyp A"),
	GM_E_50(Constants.GERMANY, Constants.MEDIUM, 9, "E-50"),
	GM_LEOPARD_1(Constants.GERMANY, Constants.MEDIUM, 10, "Leopard 1"),
	GM_E_50_M(Constants.GERMANY, Constants.MEDIUM, 10, "E-50 Ausf. M"),
	/** German Heavies */
	GM_PZ_B2(Constants.GERMANY, Constants.HEAVY, 4, "Pz.Kpfw. B2 740 (f)", "4", true),
	GM_DURCH(Constants.GERMANY, Constants.HEAVY, 4, "Durchbruchswagen 2", "4-5"),
	GM_VK_3001_H(Constants.GERMANY, Constants.HEAVY, 5, "VK 30.01 (H)"),
	GM_VK_3601(Constants.GERMANY, Constants.HEAVY, 6, "VK 36.01 (H)"),
	GM_PZ_6(Constants.GERMANY, Constants.HEAVY, 7, "Pz.Kpfw. VI Tiger"),
	GM_PZ_6_P(Constants.GERMANY, Constants.HEAVY, 7, "Pz.Kpfw. VI Tiger (P)"),
	GM_PZ_TIGER_2(Constants.GERMANY, Constants.HEAVY, 8, "Pz.Kpfw. Tiger II"),
	GM_VK_4502_A(Constants.GERMANY, Constants.HEAVY, 8, "Vk 45.02 (P) Ausf. A"),
	GM_LOWE(Constants.GERMANY, Constants.HEAVY, 8, "Lowe", true),
	GM_E_75(Constants.GERMANY, Constants.HEAVY, 9, "E-75"),
	GM_VK_4502_B(Constants.GERMANY, Constants.HEAVY, 9, "VK 45.02 (P) Ausf. B"),
	GM_E_100(Constants.GERMANY, Constants.HEAVY, 10, "E-100"),
	GM_MAUS(Constants.GERMANY, Constants.HEAVY, 10, "Maus"),
	/** German TDs */
	GT_PZJAGER(Constants.GERMANY, Constants.TD, 2, "Panzerjager I"),
	GT_MARDER_2(Constants.GERMANY, Constants.TD, 3, "Marder II"),
	GT_HETZER(Constants.GERMANY, Constants.TD, 4, "Hetzer"),
	GT_MARDER_38(Constants.GERMANY, Constants.TD, 4, "Marder 38T"),
	GT_STUG(Constants.GERMANY, Constants.TD, 5, "StuG III"),
	GT_PZ_SFL_4(Constants.GERMANY, Constants.TD, 5, "Pz.Sfl. IVc"),
	GT_JAGDPZ(Constants.GERMANY, Constants.TD, 6, "JagdPz IV"),
	GT_NASHORN(Constants.GERMANY, Constants.TD, 6, "Nashorn"),
	GT_DICKER_MAX(Constants.GERMANY, Constants.TD, 6, "Dicker Max"),
	GT_JAGDPANTHER(Constants.GERMANY, Constants.TD, 7, "Jagdpanther"),
	GT_PZ_SFL_5(Constants.GERMANY, Constants.TD, 7, "Pz.Sfl. V"),
	GT_E_25(Constants.GERMANY, Constants.TD, 7, "E-25", "7-8", true),
	GT_FERDINAND(Constants.GERMANY, Constants.TD, 8, "Ferdinand"),
	GT_JAGDPANTHER_2(Constants.GERMANY, Constants.TD, 8, "Jagdpanther II"),
	GT_RHM_WAFFENTRAGER(Constants.GERMANY, Constants.TD, 8, "Rhm.-Borsig Waffentrager"),
	GT_88_JAGDTIGER(Constants.GERMANY, Constants.TD, 8, "8,8 cm Pak 43 Jagdtiger", "8-9", true),
	GT_JAGDTIGER(Constants.GERMANY, Constants.TD, 9, "Jagdtiger"),
	GT_WAFFENTRAGER_PZ(Constants.GERMANY, Constants.TD, 9, "Waffentrager auf Pz. IV"),
	GT_JAGDPZ_E_100(Constants.GERMANY, Constants.TD, 10, "JagdPz E-100"),
	GT_WAFFENTRAGER_E_100(Constants.GERMANY, Constants.TD, 10, "Waffentrager auf E 100"),
	/** German SPGs */
	GS_G_PZ(Constants.GERMANY, Constants.SPG, 2, "G.Pz. Mk. VI (e)"),
	GS_BISON(Constants.GERMANY, Constants.SPG, 3, "Sturmpanzer I Bison"),
	GS_WESPE(Constants.GERMANY, Constants.SPG, 3, "Wespe"),
	GS_STURMPANZER_2(Constants.GERMANY, Constants.SPG, 4, "Sturmpanzer II"),
	GS_PZ_SFL_4(Constants.GERMANY, Constants.SPG, 4, "Pz.Sfl. IVb"),
	GS_GRILLE(Constants.GERMANY, Constants.SPG, 5, "Grille"),
	GS_HUMMEL(Constants.GERMANY, Constants.SPG, 6, "Hummel"),
	GS_GW_PANTHER(Constants.GERMANY, Constants.SPG, 7, "G.W. Panther"),
	GS_GW_TIGER_P(Constants.GERMANY, Constants.SPG, 8, "G.W. Tiger(P)"),
	GS_GW_TIGER(Constants.GERMANY, Constants.SPG, 9, "G.W. Tiger"),
	GS_GW_E_100(Constants.GERMANY, Constants.SPG, 10, "G.W. E 100"),
	/** Japanese Lights */
	JL_RENAULT_OTSU(Constants.JAPAN, Constants.LIGHT, 1, "Renault Otsu"),
	JL_HA_GO(Constants.JAPAN, Constants.LIGHT, 2, "Ha-Go"),
	JL_KE_NI(Constants.JAPAN, Constants.LIGHT, 3, "Ke-Ni", "3-4"),
	JL_KE_HO(Constants.JAPAN, Constants.LIGHT, 4, "Ke-Ho", "4-5"),
	/** Japanese Mediums */
	JM_CHI_NI(Constants.JAPAN, Constants.MEDIUM, 2, "Chi-Ni"),
	JM_CHI_HA(Constants.JAPAN, Constants.MEDIUM, 3, "Chi-Ha"),
	JM_CHI_HE(Constants.JAPAN, Constants.MEDIUM, 4, "Chi-He"),
	JM_CHI_NU(Constants.JAPAN, Constants.MEDIUM, 5, "Chi-Nu"),
	JM_CHI_NU_KAI(Constants.JAPAN, Constants.MEDIUM, 5, "Type 3 Chi-Nu Kai", true),
	JM_CHI_TO(Constants.JAPAN, Constants.MEDIUM, 6, "Chi-To"),
	JM_CHI_RI(Constants.JAPAN, Constants.MEDIUM, 7, "Chi-Ri"),
	JM_STA(Constants.JAPAN, Constants.MEDIUM, 8, "STA-1"),
	JM_TYPE_61(Constants.JAPAN, Constants.MEDIUM, 9, "Type 61"),
	JM_STB(Constants.JAPAN, Constants.MEDIUM, 10, "STB-1"),
	/** British Lights */
	BL_CRUISER_1(Constants.UK, Constants.LIGHT, 2, "Cruiser Mk. I"),
	BL_CRUISER_3(Constants.UK, Constants.LIGHT, 2, "Cruiser Mk. III"),
	BL_CRUISER_2(Constants.UK, Constants.LIGHT, 3, "Cruiser Mk. II"),
	BL_CRUISER_4(Constants.UK, Constants.LIGHT, 3, "Cruiser MK. IV"),
	BL_VALENTINE(Constants.UK, Constants.LIGHT, 4, "Valentine", "4-6"),
	BL_COVENANTER(Constants.UK, Constants.LIGHT, 4, "Covenanter", "4-6"),
	BL_CRUSADER("U.K", Constants.LIGHT, 5, "Crusader", "5-7"),
	/** British Mediums */
	BM_VICKERS_1(Constants.UK, Constants.MEDIUM, 1, "Vickers Medium Mk. I"),
	BM_VICKERS_2(Constants.UK, Constants.MEDIUM, 2, "Vickers Medium Mk. II"),
	BM_VICKERS_3(Constants.UK, Constants.MEDIUM, 3, "Vickers Medium Mk. III"),
	BM_MATILDA(Constants.UK, Constants.MEDIUM, 4, "Matilda"),
	BM_MATILDA_BP(Constants.UK, Constants.MEDIUM, 5, "Matilda BMack Prince", "5-6", true),
	BM_CROMWELL(Constants.UK, Constants.MEDIUM, 6, "Cromwell"),
	BM_COMET(Constants.UK, Constants.MEDIUM, 7, "Comet"),
	BM_CENTURION_1(Constants.UK, Constants.MEDIUM, 8, "Centurion Mk. I"),
	BM_CENTURION_7(Constants.UK, Constants.MEDIUM, 9, "Centurion Mk. 7/1"),
	BM_FV4202(Constants.UK, Constants.MEDIUM, 10, "FV4202"),
	/** British Heavies */
	BH_EXCELSIOR(Constants.UK, Constants.HEAVY, 5, "Excelsior", "5-6", true),
	BH_CHURCHILL_1(Constants.UK, Constants.HEAVY, 5, "Churchill I"),
	BH_CHURCHILL_7(Constants.UK, Constants.HEAVY, 6, "Chruchill VII"),
	BH_TOG(Constants.UK, Constants.HEAVY, 6, "TOG II", "6-7", true),
	BH_BP(Constants.UK, Constants.HEAVY, 7, "Black Prince"),
	BH_CAERNARVON(Constants.UK, Constants.HEAVY, 8, "Caernarvon"),
	BH_CONQUEROR(Constants.UK, Constants.HEAVY, 9, "Conqueror"),
	BH_FV215(Constants.UK, Constants.HEAVY, 10, "FV215b"),
	/** British TDs */
	BT_UC2(Constants.UK, Constants.TD, 2, "Universal Carrier 2-pdr"),
	BT_VALENTINE(Constants.UK, Constants.TD, 3, "Valentine AT"),
	BT_ALECTO(Constants.UK, Constants.TD, 4, "Alecto"),
	BT_AT_2(Constants.UK, Constants.TD, 5, "AT 2"),
	BT_CHURCHILL_GC(Constants.UK, Constants.TD, 6, "Churchill Gun Carrier"),
	BT_AT_8(Constants.UK, Constants.TD, 6, "AT 8"),
	BT_AT_7(Constants.UK, Constants.TD, 7, "AT 7"),
	BT_AT_15A(Constants.UK, Constants.TD, 7, "AT 15A"),
	BT_AT_15(Constants.UK, Constants.TD, 8, "AT 15"),
	BT_TORTOISE(Constants.UK, Constants.TD, 9, "Tortoise"),
	BT_FV215(Constants.UK, Constants.TD, 10, "FV125b (183)"),
	/** British SPGs */
	BS_LOYD(Constants.UK, Constants.SPG, 2, "Loyd Gun Carriage"),
	BS_SEXTON_1(Constants.UK, Constants.SPG, 3, "Sexton I"),
	BS_SEXTON_2(Constants.UK, Constants.SPG, 3, "Sexton II"),
	BS_BIRCH(Constants.UK, Constants.SPG, 4, "Birch Gun"),
	BS_BISHOP(Constants.UK, Constants.SPG, 5, "Bishop"),
	BS_FV304("U.K", Constants.SPG, 6, "FV304"),
	BS_CRUSADER(Constants.UK, Constants.SPG, 7, "Crusader 5.5-in. SP"),
	BS_FV207(Constants.UK, Constants.SPG, 8, "FV207"),
	BS_FV3805(Constants.UK, Constants.SPG, 9, "FV3805"),
	BS_CONQUEROR(Constants.UK, Constants.SPG, 10, "Conqueror Gun Carriage"),
	/** American Lights */
	AL_T1("U.S.A", Constants.LIGHT, 1, "T1 Cunningham"),
	AL_M2("U.S.A", Constants.LIGHT, 2, "M2 LT"),
	AL_T2(Constants.USA, Constants.LIGHT, 2, "T2 LT", "2-4", true),
	AL_T1E6(Constants.USA, Constants.LIGHT, 2, "T1E6", true),
	AL_T7(Constants.USA, Constants.LIGHT, 2, "T7 Combat Car", true),
	AL_M3(Constants.USA, Constants.LIGHT, 3, "M3 Stuart"),
	AL_M22(Constants.USA, Constants.LIGHT, 3, "M22 Locust", true),
	AL_MTLS(Constants.USA, Constants.LIGHT, 3, "MTLS-1G14", true),
	AL_M5(Constants.USA, Constants.LIGHT, 4, "M5 Stuart"),
	AL_M24(Constants.USA, Constants.LIGHT, 5, "M24 Chaffee", "7-12"),
	AL_T21("U.S.A", Constants.LIGHT, 6, "T21"),
	AL_T71(Constants.USA, Constants.LIGHT, 7, "T71"),
	/** American Mediums */
	AM_T2(Constants.USA, Constants.MEDIUM, 2, "T2 MT"),
	AM_M2(Constants.USA, Constants.MEDIUM, 3, "M2 MT"),
	AM_M3(Constants.USA, Constants.MEDIUM, 4, "M3 Lee"),
	AM_M4(Constants.USA, Constants.MEDIUM, 5, "M4 Sherman"),
	AM_M7(Constants.USA, Constants.MEDIUM, 5, "M7"),
	AM_RAM(Constants.USA, Constants.MEDIUM, 5, "Ram II", true),
	AM_M4_E4(Constants.USA, Constants.MEDIUM, 5, "M4A2E4 Sherman", "5-6", true),
	AM_M4_JUMBO(Constants.USA, Constants.MEDIUM, 6, "M4A3E2 Jumbo Sherman"),
	AM_M4_E8(Constants.USA, Constants.MEDIUM, 6, "M4A3E8 Sherman"),
	AM_T20(Constants.USA, Constants.MEDIUM, 7, "T20"),
	AM_PERSHING(Constants.USA, Constants.MEDIUM, 8, "M26 Pershing"),
	AM_SUPER_PERSHING(Constants.USA, Constants.MEDIUM, 8, "T26E4 Super Pershing", "8-9", true),
	AM_T69(Constants.USA, Constants.MEDIUM, 8, "T69"),
	AM_M46_PATTON(Constants.USA, Constants.MEDIUM, 9, "M46 Patton"),
	AM_T54E1(Constants.USA, Constants.MEDIUM, 9, "T54E1"),
	AM_M48_PATTON(Constants.USA, Constants.MEDIUM, 10, "M48A1 Patton"),
	AM_M60(Constants.USA, Constants.MEDIUM, 10, "M60", true),
	/** American Heavies */
	AH_T1(Constants.USA, Constants.HEAVY, 5, "T1 Heavy"),
	AH_T14(Constants.USA, Constants.HEAVY, 5, "T14", "5-6", true),
	AH_M6(Constants.USA, Constants.HEAVY, 6, "M6"),
	AH_T29("U.S.A", Constants.HEAVY, 7, "T29"),
	AH_T32(Constants.USA, Constants.HEAVY, 8, "T32"),
	AH_T34(Constants.USA, Constants.HEAVY, 8, "T34"),
	AH_M6A2E1(Constants.USA, Constants.HEAVY, 8, "M6A2E1", true),
	AH_M103(Constants.USA, Constants.HEAVY, 9, "M103"),
	AH_T110(Constants.USA, Constants.HEAVY, 10, "T100E5"),
	AH_T57(Constants.USA, Constants.HEAVY, 10, "T57 HT"),
	/** American TDs */
	AT_T18(Constants.USA, Constants.TD, 2, "T18"),
	AT_T82(Constants.USA, Constants.TD, 3, "T82"),
	AT_T40(Constants.USA, Constants.TD, 4, "T40"),
	AT_M8(Constants.USA, Constants.TD, 4, "M8A1"),
	AT_WOLVERINE(Constants.USA, Constants.TD, 5, "M10 Wolverine"),
	AT_T49(Constants.USA, Constants.TD, 5, "T49"),
	AT_JACKSON(Constants.USA, Constants.TD, 6, "M36 Jackson"),
	AT_HELLCAT(Constants.USA, Constants.TD, 6, "M18 Hellcat"),
	AT_T25_AT(Constants.USA, Constants.TD, 7, "T25 AT"),
	AT_T25_2(Constants.USA, Constants.TD, 7, "T25/2"),
	AT_T28(Constants.USA, Constants.TD, 8, "T28"),
	AT_T28_PROTO(Constants.USA, Constants.TD, 8, "T28 Prototype"),
	AT_T95(Constants.USA, Constants.TD, 9, "T95"),
	AT_T30(Constants.USA, Constants.TD, 9, "T30"),
	AT_T110_3(Constants.USA, Constants.TD, 10, "T110E3"),
	AT_T110_4(Constants.USA, Constants.TD, 10, "T110E4"),
	/** American SPGs */
	AS_T57(Constants.USA, Constants.SPG, 2, "T57"),
	AS_M7(Constants.USA, Constants.SPG, 3, "M7 Priest"),
	AS_M37(Constants.USA, Constants.SPG, 4, "M37"),
	AS_M41(Constants.USA, Constants.SPG, 5, "M41"),
	AS_M44(Constants.USA, Constants.SPG, 6, "M44"),
	AS_M12(Constants.USA, Constants.SPG, 7, "M12"),
	AS_M40(Constants.USA, Constants.SPG, 8, "M40/M43"),
	AS_M53(Constants.USA, Constants.SPG, 9, "M53/55"),
	AS_T92(Constants.USA, Constants.SPG, 10, "T92"),
	/** Russian Lights */
	RL_MS(Constants.USSR, Constants.LIGHT, 1, "MS-1"),
	RL_T_26(Constants.USSR, Constants.LIGHT, 2, "T-46"),
	RL_BT_2(Constants.USSR, Constants.LIGHT, 2, "BT-2"),
	RL_T_60(Constants.USSR, Constants.LIGHT, 2, "T-60"),
	RL_TETRARCH(Constants.USSR, Constants.LIGHT, 2, "Tetrarch", true),
	RL_T_46(Constants.USSR, Constants.LIGHT, 3, "T-46"),
	RL_BT_7(Constants.USSR, Constants.LIGHT, 3, "BT-7"),
	RL_LTP(Constants.USSR, Constants.LIGHT, 3, "LTP", true),
	RL_T_70(Constants.USSR, Constants.LIGHT, 3, "T-70"),
	RL_T_127(Constants.USSR, Constants.LIGHT, 3, "T-127", "3-4", true),
	RL_BT_SV(Constants.USSR, Constants.LIGHT, 3, "BT-SV", "3-4", true),
	RL_M3(Constants.USSR, Constants.LIGHT, 3, "M3 Light", "3-4", true),
	RL_T_50(Constants.USSR, Constants.LIGHT, 4, "T-50"),
	RL_A_20(Constants.USSR, Constants.LIGHT, 4, "A-20"),
	RL_T_80(Constants.USSR, Constants.LIGHT, 4, "T-80", "4-6"),
	RL_VALENTINE(Constants.USSR, Constants.LIGHT, 4, "Valentine II", "4", true),
	RL_MT_25(Constants.USSR, Constants.LIGHT, 6, "MT-25"),
	/** Russian Mediums */
	RM_T_28(Constants.USSR, Constants.MEDIUM, 4, "T-28"),
	RM_A_32(Constants.USSR, Constants.MEDIUM, 4, "A-32", "4-5", true),
	RM_T_34(Constants.USSR, Constants.MEDIUM, 5, "T-34"),
	RM_MATILDA(Constants.USSR, Constants.MEDIUM, 5, "Matilda IV", "5-6", true),
	RM_A_43(Constants.USSR, Constants.MEDIUM, 6, "A-43"),
	RM_T_34_85(Constants.USSR, Constants.MEDIUM, 6, "T-34-85"),
	RM_A_44(Constants.USSR, Constants.MEDIUM, 7, "A-44"),
	RM_KV_13(Constants.USSR, Constants.MEDIUM, 7, "KV-13"),
	RM_T_43(Constants.USSR, Constants.MEDIUM, 7, "T-43"),
	RM_OBJECT_416(Constants.USSR, Constants.MEDIUM, 8, "Object 416"),
	RM_T_44(Constants.USSR, Constants.MEDIUM, 8, "T-44"),
	RM_T_54(Constants.USSR, Constants.MEDIUM, 9, "T-54"),
	RM_OBJECT_430_2(Constants.USSR, Constants.MEDIUM, 9, "Object 430 Variant II"),
	RM_OBJECT_430(Constants.USSR, Constants.MEDIUM, 10, "Object 430"),
	RM_OBJECT_140(Constants.USSR, Constants.MEDIUM, 10, "Object 140"),
	RM_T_62(Constants.USSR, Constants.MEDIUM, 10, "T-62A"),
	/** Russian Heavies */
	RH_KV_1(Constants.USSR, Constants.HEAVY, 5, "KV-1"),
	RH_CHURCHILL(Constants.USSR, Constants.HEAVY, 5, "Churchill III", "5-6", true),
	RH_KV_220(Constants.USSR, Constants.HEAVY, 5, "KV-220", "5-6", true),
	RH_KV_220_BT(Constants.USSR, Constants.HEAVY, 5, "KV-220 Beta-Test", "5-6", true),
	RH_KV_2(Constants.USSR, Constants.HEAVY, 6, "KV-2"),
	RH_T_150(Constants.USSR, Constants.HEAVY, 6, "T-150"),
	RH_KV_1S(Constants.USSR, Constants.HEAVY, 6, "KV-1S"),
	RH_KV_3(Constants.USSR, Constants.HEAVY, 7, "KV-3"),
	RH_IS(Constants.USSR, Constants.HEAVY, 7, "IS"),
	RH_KV_4(Constants.USSR, Constants.HEAVY, 8, "KV-4"),
	RH_IS_3(Constants.USSR, Constants.HEAVY, 8, "IS-6"),
	RH_IS_6(Constants.USSR, Constants.HEAVY, 8, "IS-6", "8-9", true),
	RH_KV_5(Constants.USSR, Constants.HEAVY, 8, "KV-5", "8-9", true),
	RH_ST_1(Constants.USSR, Constants.HEAVY, 9, "ST-I"),
	RH_IS_8(Constants.USSR, Constants.HEAVY, 9, "IS-8"),
	RH_IS_4(Constants.USSR, Constants.HEAVY, 10, "IS-4"),
	RH_IS_7(Constants.USSR, Constants.HEAVY, 10, "IS-7"),
	/** Russian TDs */
	RT_AT_1(Constants.USSR, Constants.TD, 2, "AT-1"),
	RT_SU_76(Constants.USSR, Constants.TD, 3, "SU-76"),
	RT_SU_85B(Constants.USSR, Constants.TD, 4, "SU-85B"),
	RT_SU_85(Constants.USSR, Constants.TD, 5, "SU-85"),
	RT_SU_85I(Constants.USSR, Constants.TD, 5, "SU-85I", true),
	RT_SU_100(Constants.USSR, Constants.TD, 6, "SU-100"),
	RT_SU_100Y(Constants.USSR, Constants.TD, 6, "SU-100Y"),
	RT_SU_100M1(Constants.USSR, Constants.TD, 7, "SU-100M1"),
	RT_SU_152(Constants.USSR, Constants.TD, 7, "SU-152"),
	RT_SU_122_44(Constants.USSR, Constants.TD, 7, "SU-122-44"),
	RT_SU_101(Constants.USSR, Constants.TD, 8, "SU-101"),
	RT_ISU_152(Constants.USSR, Constants.TD, 8, "ISU-152"),
	RT_SU_122_54(Constants.USSR, Constants.TD, 9, "SU-122_54"),
	RT_OBJECT_704(Constants.USSR, Constants.TD, 9, "Object 704"),
	RT_OBJECT_263(Constants.USSR, Constants.TD, 10, "Object 263"),
	RT_OBJECT_268(Constants.USSR, Constants.TD, 10, "Object 268"),
	/** Russian SPGs */
	RS_SU_18(Constants.USSR, Constants.SPG, 2, "SU-18"),
	RS_SU_26(Constants.USSR, Constants.SPG, 3, "SU-26"),
	RS_SU_5(Constants.USSR, Constants.SPG, 4, "SU-5"),
	RS_SU_122(Constants.USSR, Constants.SPG, 5, "SU-122A"),
	RS_SU_8(Constants.USSR, Constants.SPG, 6, "SU-8"),
	RS_S_51(Constants.USSR, Constants.SPG, 7, "S-51"),
	RS_SU_15_1(Constants.USSR, Constants.SPG, 7, "SU-14-1"),
	RS_SU_14(Constants.USSR, Constants.SPG, 8, "SU-14"),
	RS_212(Constants.USSR, Constants.SPG, 9, "212A"),
	RS_OBJECT_261(Constants.USSR, Constants.SPG, 10, "Object 261");
	
	private final String country;
	private final String type;
	private final int tier;
	private final String name;
	private final String battleTier;
	private final boolean premium;
	
	private Tank(String country, String type, int tier, String name)
	{
		this(country, type, tier, name, "", false);
	}
	
	private Tank(String country, String type, int tier, String name, String battleTier)
	{
		this(country, type, tier, name, battleTier, false);
	}
	
	private Tank(String country, String type, int tier, String name, boolean premium)
	{
		this(country, type, tier, name, "", premium);
	}
	
	private Tank(String country, String type, int tier, String name, String battleTier, boolean premium)
	{
		this.country = country;
		this.type = type;
		this.tier = tier;
		this.name = name;
		this.premium = premium;
		
		if (battleTier == "")
		{
			if ((type == "Light" || type == "Medium") && tier == 1)
					battleTier = "1-2";
			else if ((type == "Light" || type == "Medium" || type == "TD" || type == "SPG") && (tier == 2 || tier == 3))
			{
				if (tier == 2)
					battleTier = "2-3";
				else if (tier == 3)
					battleTier = "3-5";
			}
			else if (type == "Light")
			{
				if (tier == 4)
					battleTier = "4-8";
				else if (tier == 5)
					battleTier = "6-9";
				else if (tier == 6)
					battleTier = "7-10";
				else if (tier == 7)
					battleTier = "8-11";
				else if (tier == 8)
					battleTier = "9-12";
			}
			else if ((type == "Medium" || type == "TD" || type == "SPG") && tier == 4)
				battleTier = "4-6";
			else if (type == "Heavy" && tier == 4)
				battleTier = "4-5";
			else if ((type == "Medium" || type == "Heavy" || type == "TD" || type == "SPG") && tier >= 5)
			{
				if (tier == 5)
					battleTier = "5-7";
				else if (tier == 6)
					battleTier = "6-8";
				else if (tier == 7)
					battleTier = "7-9";
				else if (tier == 8)
					battleTier = "8-10";
				else if (tier == 9)
					battleTier = "9-11";
				else if (tier == 10)
					battleTier = "10-12";
			}
		}
		
		this.battleTier = battleTier;
	}
	
	public String getCountry()
	{
		return country;
	}
	
	public String getType()
	{
		return type;
	}
	
	public Integer getTier()
	{
		return tier;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getBattleTier()
	{
		return battleTier;
	}
	
	public String isPremium()
	{
		if(premium)
			return "Premium";
		
		return "Non-Premium";
	}
}
