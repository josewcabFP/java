#!/bin/bash

comentario = $*

git add .
git commit -m "${*}"
