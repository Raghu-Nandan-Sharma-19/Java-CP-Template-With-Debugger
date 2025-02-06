# sublime build :
# {
    "shell_cmd": "javac Main.java && java Main < input.txt > output.txt",
    "file_regex": "^(...*?):([0-9]*):?([0-9]*)",
    "selector": "source.java",
    "working_dir": "$file_path",
    "encoding": "utf-8"
}