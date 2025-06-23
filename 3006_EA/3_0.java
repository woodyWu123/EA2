const images = [
    'dummy_tanks_7.jpg', // 替換為你的圖片 URL
    'th.jpg', // 替換為你的圖片 URL
    '螢幕擷取畫面 2024-12-17 203438.png'  // 替換為你的圖片 URL
];

// 隨機選擇一張圖片
const randomIndex = Math.floor(Math.random() * images.length);
document.getElementById('rotate').src = images[randomIndex];