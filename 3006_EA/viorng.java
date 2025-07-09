const images = [
    'https://www.youtube.com/embed/FPJ2T26ydlk?autoplay=1&mute=1&controls=0&loop=1&playlist=FPJ2T26ydlk',
    'https://www.youtube.com/embed/JmSC9xahhyA?autoplay=1&mute=1&controls=0&loop=1&playlist=JmSC9xahhyA',
    'https://www.youtube.com/embed/4xxbhYRvW5Y?autoplay=1&mute=1&controls=0&loop=1&playlist=4xxbhYRvW5Y',
    'https://www.youtube.com/embed/kXj0o0gIbho?autoplay=1&mute=1&controls=0&loop=1&playlist=kXj0o0gIbho',
    'https://www.youtube.com/embed/LRvzUgyJucA?autoplay=1&mute=1&controls=0&loop=1&playlist=LRvzUgyJucA'
];

// 隨機選擇一張圖片
const randomIndex = Math.floor(Math.random() * images.length);
document.getElementById('video-background').src = images[randomIndex];