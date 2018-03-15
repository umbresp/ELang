<?php
if ($argc != 2) {
  echo "No file to interpret.";
  exit();
} elseif (preg_match('/\.e$/', $argv[1])) {
  try {
    // $handle = fopen($argv[1], "r");
    $filestr = file_get_contents($argv[1]);
    $filearr = explode(" ", $filestr);
    $output = "";
    foreach ($filearr as $value) {
      $length = strlen($value);
      $output .= chr($length);
    }
    echo $output;
  } catch (\Exception $e) {
    echo "Could not open the file.";
    exit();
  }
} else {
  echo "Invalid source file.";
  exit();
}
?>
