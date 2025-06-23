        function swapColors() {
            const boxes = document.querySelectorAll('.box');
            boxes.forEach(box => {
                box.classList.toggle('swapColor');
            });
            const footer = document.querySelector('.footer');
            footer.classList.toggle('swapColor');
        }
        /*            const header = document.querySelector('.header');
            header.classList.toggle('swapColor');*/