<?php 
ini_set('display_errors', 1);
ini_set('display_startup_errors', 1);
error_reporting(E_ALL);
$content = ob_get_clean(); 
require "layout.php"; 
require __DIR__ . '/../vendor/autoload.php'; 
use App\Controller\HomeController; 
$controller = new HomeController(); 
echo $controller->index(); 
echo "<br>"; 
$diretorio = "."; 
$arquivos=scandir($diretorio); 
$excluir = ['index.php','footer.php','layout.php']; 
foreach ($arquivos as $arquivo) { 
    if (pathinfo($arquivo, PATHINFO_EXTENSION) === 'php' && !in_array($arquivo, $excluir)) { 
        echo '<a href="' . $diretorio . '/' . $arquivo . '" target="_blank">' . $arquivo . '</a><br>'; 
    } 
} 
require "footer.php"; 
?> 
