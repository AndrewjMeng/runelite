package net.runelite.api;

/**
 * Information about a specific {@link NpcID}
 */
public interface NPCDefinition
{
    /**
     * Gets the name of the NPC.
     */
    String getName();

    /**
     * Gets the model IDs that compose this NPC.
     */
    int[] getModels();

    /**
     * The 5 menuops this NPC has when in world. Index 0 corresponds to
     * {@link MenuAction#NPC_FIRST_OPTION}, Index 2 to
     * {@link MenuAction#NPC_SECOND_OPTION} and so on.
     */
    String[] getActions();

    boolean isClickable();

    boolean isFollower();

    /**
     * Gets whether the NPC is visible on the mini-map.
     */
    boolean isMinimapVisible();

    boolean isVisible();

    /**
     * Gets the ID of the NPC.
     *
     * @see NpcID
     */
    int getId();

    /**
     * @return the combat level, -1 if none
     */
    int getCombatLevel();

    /**
     * Get the {@link NpcID}s of NPCs this can transform into, depending
     * on a {@link Varbits} or {@link VarPlayer}
     */
    int[] getConfigs();

    /**
     * Get the NPC composition the player's state says this NPC should
     * transmogrify into.
     *
     * @throws NullPointerException if {@link #getConfigs()} is null
     */
    NPCDefinition transform();

    /**
     * How many tiles wide this NPC is
     */
    int getSize();

    /**
     * Gets the displayed overhead icon of the NPC.
     */
    HeadIcon getOverheadIcon();
}