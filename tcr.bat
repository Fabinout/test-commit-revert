:loop

mvn clean test && git commit -am "working" || git reset --hard

goto loop
