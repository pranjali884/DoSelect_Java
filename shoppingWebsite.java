package doSelect;

class Custom {
    int id;
    String name;
    double walletBalance;
    String address;

    public Custom(int id, String name, double walletBalance, String address) {
        this.id = id;
        this.name = name;
        this.walletBalance = walletBalance;
        this.address = address;
    }
}

class It {
    int id;
    String name;
    String companyName;
    double price;
    boolean isInStock;

    public It(int id, String name, String companyName, double price, boolean isInStock) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.price = price;
        this.isInStock = isInStock;
    }
}

class ShoppingWebsite {
    public String purchaseItem(It item, Custom customer) throws ItemOutOfStockException, InsufficientBalanceException {
        if (!item.isInStock) {
            throw new ItemOutOfStockException("Item is out of stock.");
        }

        if (customer.walletBalance < item.price) {
            throw new InsufficientBalanceException("Insufficient balance to purchase the item.");
        }

        customer.walletBalance -= item.price;
        return "Item purchased successfully.";
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class ItemOutOfStockException extends Exception {
    public ItemOutOfStockException(String message) {
        super(message);
    }
}
