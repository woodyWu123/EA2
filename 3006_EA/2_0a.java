const images = [
    'image1.jpg', // 替換為你的圖片 URL
    'image2.jpg', // 替換為你的圖片 URL
    'image3.jpg'  // 替換為你的圖片 URL
];

// 隨機選擇一張圖片
const randomIndex = Math.floor(Math.random() * images.length);
document.getElementById('randomImage').src = images[randomIndex];