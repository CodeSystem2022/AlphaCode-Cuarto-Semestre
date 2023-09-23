const modalContainer = document.getElementById("modal-container");
const modalOverlay = document.getElementById("modal-overlay");

const cartBtn = document.getElementById("cart-btn");

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

        
};

cartBtn.addEventListener("click",displayCart);

        
