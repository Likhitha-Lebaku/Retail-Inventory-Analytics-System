const API = "http://localhost:8080/products";

async function loadProducts() {

    const response = await fetch(API);
    const data = await response.json();

    const table = document.getElementById("productTable");
    table.innerHTML = "";

    data.forEach(product => {

        table.innerHTML += `
        <tr>
            <td>${product.productId}</td>
            <td>${product.productName}</td>
            <td>${product.category}</td>
            <td>${product.purchasePrice}</td>
            <td>${product.sellingPrice}</td>
            <td>${product.stockQuantity}</td>
            <td>${product.unitsSold}</td>
        </tr>`;
    });

}

async function addProduct() {

    const product = {

        productName: document.getElementById("productName").value,
        category: document.getElementById("category").value,
        purchasePrice: parseFloat(document.getElementById("purchasePrice").value),
        sellingPrice: parseFloat(document.getElementById("sellingPrice").value),
        stockQuantity: parseInt(document.getElementById("stockQuantity").value),
        unitsSold: parseInt(document.getElementById("unitsSold").value)

    };

    await fetch(API, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(product)
    });

    loadProducts();
}

window.onload = loadProducts;