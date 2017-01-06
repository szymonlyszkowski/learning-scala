#!/bin/sh
exec scala "$0" "$@"
!#

println("Hello world args" + args(0))