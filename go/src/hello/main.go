package main

import (
	"fmt"
	c "github.com/skilstak/go/colors"
	"os"
	"time"
)

func PrintPlain(message string) {
	fmt.Println(message)
}

func PrintLoop(message string) {
	for {
		fmt.Println(message)
	}
}

func PrintColor(message string) {
	for {
		fmt.Println(c.Rc() + message + c.X)
	}
}

func PrintMulti(message string) {
	for {
		fmt.Println(c.X + c.Multi(message))
		time.Sleep(500 * time.Millisecond)
	}
}

func main() {
	var name = "world!"
	if len(os.Args) > 1 {
		name = os.Args[1]
	}
	PrintMulti("Hello " + name)
}
