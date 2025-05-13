import tkinter as tk
from tkinter import messagebox

class PizzaOrderingService:
    def __init__(self, root):
        self.sizes = ["small", "medium", "large"]
        self.bases = ["thick", "thin"]
        self.standard_toppings = ["tomato", "cheese"]
        self.additional_toppings = ["pepperoni", "chicken", "extra cheese", "mushrooms", "button mushrooms", "cremini mushrooms", "spinach", "olives"]
        self.orders = []
        self.sales = {base: {size: 0 for size in self.sizes} for base in self.bases}
        self.topping_sales = {topping: 0 for topping in self.additional_toppings}
        
        self.root = root
        self.root.title("Iyara Pizza Ordering Service")

        self.customer_name_var = tk.StringVar()
        self.size_var = tk.StringVar()
        self.size_var.set(self.sizes[0])
        self.base_var = tk.StringVar()
        self.base_var.set(self.bases[0])
        self.toppings_vars = {topping: tk.BooleanVar() for topping in self.additional_toppings}
        
        self.create_widgets()

    def create_widgets(self):
        tk.Label(self.root, text="Welcome to Iyara Pizza").grid(row=0, columnspan=2)

        tk.Label(self.root, text="Customer Name:").grid(row=1, column=0, sticky="w")
        tk.Entry(self.root, textvariable=self.customer_name_var).grid(row=1, column=1, sticky="w")

        tk.Label(self.root, text="Choose size:").grid(row=2, column=0, sticky="w")
        tk.OptionMenu(self.root, self.size_var, *self.sizes).grid(row=2, column=1, sticky="w")

        tk.Label(self.root, text="Choose base:").grid(row=3, column=0, sticky="w")
        tk.OptionMenu(self.root, self.base_var, *self.bases).grid(row=3, column=1, sticky="w")

        tk.Label(self.root, text="Choose additional toppings (up to 3):").grid(row=4, columnspan=2, sticky="w")
        for idx, (topping, var) in enumerate(self.toppings_vars.items(), start=5):
            tk.Checkbutton(self.root, text=topping, variable=var).grid(row=idx, columnspan=2, sticky="w")

        tk.Button(self.root, text="Confirm Order", command=self.confirm_order).grid(row=idx + 1, column=0, sticky="w")
        tk.Button(self.root, text="Print Sales Report", command=self.print_sales_report).grid(row=idx + 1, column=1, sticky="w")
        tk.Button(self.root, text="Print Topping Report", command=self.print_topping_report).grid(row=idx + 2, column=0, columnspan=2, sticky="w")
        tk.Button(self.root, text="Exit", command=self.root.quit).grid(row=idx + 3, column=0, columnspan=2, sticky="w")

    def confirm_order(self):
        customer_name = self.customer_name_var.get()
        size = self.size_var.get()
        base = self.base_var.get()
        toppings = [topping for topping, var in self.toppings_vars.items() if var.get()]

        if len(toppings) > 3:
            messagebox.showerror("Error", "You can choose up to 3 additional toppings.")
            return

        pizza = {
            "customer_name": customer_name,
            "size": size,
            "base": base,
            "toppings": self.standard_toppings + toppings
        }

        order_number = len(self.orders) + 1
        self.orders.append(pizza)
        self.sales[base][size] += 1
        for topping in toppings:
            self.topping_sales[topping] += 1

        messagebox.showinfo("Order Confirmed", f"Thank you, {customer_name}! Your order number is {order_number}.\nSize: {size}\nBase: {base}\nToppings: {', '.join(pizza['toppings'])}")

    def print_sales_report(self):
        report = "Sales report:\n"
        for base in self.bases:
            for size in self.sizes:
                report += f"{base.capitalize()} base, {size.capitalize()} size: {self.sales[base][size]} sales\n"
        messagebox.showinfo("Sales Report", report)

    def print_topping_report(self):
        most_popular = max(self.topping_sales, key=self.topping_sales.get)
        least_popular = min(self.topping_sales, key=self.topping_sales.get)
        report = f"Topping sales report:\nMost popular topping: {most_popular} with {self.topping_sales[most_popular]} sales\nLeast popular topping: {least_popular} with {self.topping_sales[least_popular]} sales"
        messagebox.showinfo("Topping Report", report)

def main():
    root = tk.Tk()
    app = PizzaOrderingService(root)
    root.mainloop()

if __name__ == "__main__":
    main()
