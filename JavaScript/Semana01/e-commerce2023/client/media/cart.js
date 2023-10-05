const modalContainer = document.getElementById("modal-container");
const modalOverlay = document.getElementById("modal-overlay");

const cartBtn = document.getElementById("cart-btn");
const cartCounter = document.getElementById("cart-counter");

const displayCart = () => {
        modalContainer.innerHTML = "";
  modalContainer.style.display = "block";
  modalContainer.style.display = "block";
    //modal Header
    const modalHeader = document.createElement("div");
    
    const modalClose = document.createElement("div");
    modalClose.innerText = "❌";
    modalClose.className = "modal-close";
    modalHeader.append(modalClose);

  modalClose.addEventListener("click", () => {
    modalContainer.style.display = "none";
    modalOverlay.style.display = "none";

  });

  const modalTitle = document.createElement("div");
        
  const modalTitle = document.createElement("div");
  modalTitle.innerText = "Cart";
  modalTitle.ClassName = "modal-title";
  modalHeader.append(modalTitle)

  modalContainer.append(modalHeader);
//modal Body
        if (cart.lenght > 0){
        cart.forEach((product) => {
            const modalBody = document.createElement("div");
            modalBody.className = "modal-body";
            modalBody.innerHTML = `
            <div class="product">
                    <img class="product-img" src="${product.img}" />
                    <div class="product-info">
                        <h4>${product.productName}</h4>
                    <div>
                <div class="quantity">
                    <span class="quantity-btn-decrese">-</span>
                    <span class="quantity-input">${product.quanty}</span>
                    <span class="quantity.btn.increse">+</span>
                </div>
                    <div class="price">${product.price * product.quanty} $</div>
                    <div class="delete-product">❌</div>
            </div>        
            `;
            modalContainer.append(modalBody);           
        });

        //delete
        const deleteProduct = modalBody.querySelector(".delete-product");

        deleteProduct.addEvenListener("click", ()=> {
          deleteCartProduct(product.id);

  })
});
        
         //modal fotter
    const total = cart.reduce((acc, el) => acc + el.price * el.quanty, 0);

    const modalFooter = document.createElement("div");
    modalFooter.className = "modal-footer"
    modalFooter.innerHTML = `
    <div class="total-price">Total: ${total}</div>
    `;
        modalContainer.append(modalFooter);
};

cartBtn.addEventListener("click",displayCart);

const deleteCartProduct =  (id) => {
  const foundId = cart.findIndex((element)=> element.id === id);
        
  console.log(foundId);
        

};

const displayCartCounter =()> {
  const cartLenght = cart.reduce((acc, el) => acc + el.quanty, 0);
  if (cartLenght > 0) {
     cartCounter.style.display = "block";
     cartCounter.innerText = cartLenght;
  } else {
    cartCounter.style.display = "none";
  }
};
 
  
   
}
} else{
        const modalText = document.createElement("h2");
        modalClose.className = "modal-body";
        modalText.innerText = "your cart is empty";
        modalContainer.append(modalText);
}
        













const decrese = modalBody.querySelector(".quantity-btn-decrese")
        DecompressionStream.addEventListener("click", ()=> {
            if(product.quanty !== 1){
                product.quanty--;
                displayCart();
                displayCartCounter();
            }
        });