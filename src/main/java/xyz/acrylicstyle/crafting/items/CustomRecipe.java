package xyz.acrylicstyle.crafting.items;

import org.bukkit.inventory.ItemStack;

public class CustomRecipe {
    private ItemStack slot0;
    private ItemStack slot1;
    private ItemStack slot2;
    private ItemStack slot3;
    private ItemStack slot4;
    private ItemStack slot5;
    private ItemStack slot6;
    private ItemStack slot7;
    private ItemStack slot8;
    private final ItemStack result;

    public CustomRecipe(ItemStack[] matrix, ItemStack result) {
        for (int i = 0; i < matrix.length; i++) {
            switch (i) {
                case 0: this.slot0 = matrix[i];
                case 1: this.slot1 = matrix[i];
                case 2: this.slot2 = matrix[i];
                case 3: this.slot3 = matrix[i];
                case 4: this.slot4 = matrix[i];
                case 5: this.slot5 = matrix[i];
                case 6: this.slot6 = matrix[i];
                case 7: this.slot7 = matrix[i];
                case 8: this.slot8 = matrix[i];
            }
        }
        this.result = result;
    }

    public ItemStack getSlot0() {
        return slot0;
    }

    public ItemStack getSlot1() {
        return slot1;
    }

    public ItemStack getSlot2() {
        return slot2;
    }

    public ItemStack getSlot3() {
        return slot3;
    }

    public ItemStack getSlot4() {
        return slot4;
    }

    public ItemStack getSlot5() {
        return slot5;
    }

    public ItemStack getSlot6() {
        return slot6;
    }

    public ItemStack getSlot7() {
        return slot7;
    }

    public ItemStack getSlot8() {
        return slot8;
    }

    public ItemStack getResult() {
        return result;
    }
}
